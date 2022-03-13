package com.ggar.rayz.ur.core.account.port;

import com.ggar.rayz.ur.domain.Account;
import com.ggar.rayz.ur.domain.Email;
import com.ggar.rayz.ur.domain.Password;
import com.ggar.rayz.ur.domain.UserRole;
import com.ggar.rayz.ur.domain.Username;

public interface CreateAccountPort {

	public Account run(Username username, Password password, Email email, UserRole userRole);

}
