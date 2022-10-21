package com.ggar.rayz.management.core;

import com.ggar.rayz.management.core.port.account.CreateAccountPort;
import com.ggar.rayz.management.core.port.account.FindAccountByIdPort;
import com.ggar.rayz.management.core.port.password.HashPasswordPort;
import com.ggar.rayz.management.core.port.account.UpdateAccountPort;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountServiceImpl implements AccountService {

	CreateAccountPort createAccountPort;
	FindAccountByIdPort findAccountByIdPort;
	UpdateAccountPort updateAccountPort;
	HashPasswordPort hashPasswordPort;
	DateService dateService;

}
