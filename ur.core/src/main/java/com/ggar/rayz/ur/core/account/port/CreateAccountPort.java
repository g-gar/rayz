package com.ggar.rayz.ur.core.account.port;

import com.ggar.rayz.ur.domain.account.Account;
import com.ggar.rayz.ur.domain.account.Email;
import com.ggar.rayz.ur.domain.account.Password;
import com.ggar.rayz.ur.domain.account.UserRole;
import com.ggar.rayz.ur.domain.account.Username;

public interface CreateAccountPort {

	public Account run(Username username, Password password, Email email, UserRole userRole);

}
