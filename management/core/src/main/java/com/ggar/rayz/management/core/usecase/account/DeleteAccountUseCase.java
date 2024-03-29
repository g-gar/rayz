package com.ggar.rayz.management.core.usecase.account;

import com.ggar.rayz.management.core.domain.model.account.Account;
import com.ggar.rayz.management.core.domain.model.account.AccountId;
import com.ggar.rayz.management.core.domain.model.account.AccountState;
import com.ggar.rayz.management.core.port.account.FindAccountByIdPort;
import com.ggar.rayz.management.core.port.account.UpdateAccountPort;
import lombok.NonNull;

public interface DeleteAccountUseCase {

	FindAccountByIdPort getFindAccountByIdPort();
	UpdateAccountPort getUpdateAccountPort();

	default Account deleteAccount(@NonNull AccountId accountId) {
		Account account = this.getFindAccountByIdPort()
			.execute(accountId)
			.withState(AccountState.DELETED);
		return this.getUpdateAccountPort().execute(account);
	}

}
