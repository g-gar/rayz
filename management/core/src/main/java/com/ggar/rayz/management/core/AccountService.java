package com.ggar.rayz.management.core;

import com.ggar.rayz.management.core.usecase.account.CreateAccountUseCase;
import com.ggar.rayz.management.core.usecase.account.DeleteAccountUseCase;
import com.ggar.rayz.management.core.usecase.account.EnableAccountUseCase;

public interface AccountService extends
	CreateAccountUseCase,
	DeleteAccountUseCase,
	EnableAccountUseCase
{

}