package com.ggar.rayz.ur.core.account.port;

import com.ggar.rayz.ur.domain.account.Account;
import com.ggar.rayz.ur.domain.account.Email;
import com.ggar.rayz.ur.domain.account.Password;
import com.ggar.rayz.ur.domain.account.AccountType;
import com.ggar.rayz.ur.domain.account.Username;

public interface AccountRepositoryPort {

	public Account run(Username username, Password password, Email email, AccountType accountType);

}
