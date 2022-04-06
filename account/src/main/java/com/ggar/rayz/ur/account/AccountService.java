package com.ggar.rayz.ur.account;

import com.ggar.rayz.ur.account.model.*;

public interface AccountService {

	Account create(Username username, Email email, Password password, AccountType accountType);
	Account undelete(AccountId accountId);
	Account delete(AccountId accountId);


}
