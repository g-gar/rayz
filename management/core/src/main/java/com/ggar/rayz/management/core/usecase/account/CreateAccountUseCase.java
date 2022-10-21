package com.ggar.rayz.management.core.usecase.account;

import com.ggar.rayz.management.core.DateService;
import com.ggar.rayz.management.core.model.*;
import com.ggar.rayz.management.core.port.account.CreateAccountPort;
import com.ggar.rayz.management.core.port.password.HashPasswordPort;
import lombok.NonNull;

import java.time.ZoneId;

public interface CreateAccountUseCase {

	CreateAccountPort getCreateAccountPort();
	HashPasswordPort getHashPasswordPort();
	DateService getDateService();

	default Account createAccount(@NonNull Username username, @NonNull Email email, @NonNull Password password, @NonNull AccountType accountType) {
		Account account = Account.builder()
			.username(username)
			.email(email)
			.passwordHash(this.getHashPasswordPort().execute(password))
			.role(accountType)
			.created(this.getDateService().getDateTime(ZoneId.systemDefault()))
			.state(AccountState.CREATING)
			.build();
		return this.getCreateAccountPort().execute(account);
	}

}
