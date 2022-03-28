package com.ggar.rayz.ur.core.service;

import com.ggar.rayz.ur.domain.account.*;

public interface AccountService {

	Account create(Username username, Email email, Password password, AccountType accountType);
	Account undelete(AccountId accountId);
	Account delete(AccountId accountId);

}
