package com.ggar.rayz.management.core.usecase.account;

import com.ggar.rayz.management.core.domain.model.account.Account;
import com.ggar.rayz.management.core.domain.model.account.AccountId;
import com.ggar.rayz.management.core.port.account.FindAccountByIdPort;
import com.ggar.rayz.management.core.port.account.UpdateAccountPort;

import java.util.EnumSet;

import static com.ggar.rayz.management.core.domain.model.account.AccountState.*;

public interface EnableAccountUseCase {

	FindAccountByIdPort getFindAccountByIdPort();
	UpdateAccountPort getUpdateAccountPort();

	default Account enableAccount(AccountId accountId) {
		Account account = this.getFindAccountByIdPort().execute(accountId);
		if (EnumSet.of(CREATED, DELETED).contains(account.getState())) {
			account = this.getUpdateAccountPort().execute(account.withState(ENABLED));
		}
		return account;
	}

}
