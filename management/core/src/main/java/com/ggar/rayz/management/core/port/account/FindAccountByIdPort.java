package com.ggar.rayz.management.core.port.account;

import com.ggar.rayz.management.core.domain.model.account.Account;
import com.ggar.rayz.management.core.domain.model.account.AccountId;
import lombok.NonNull;

public interface FindAccountByIdPort {

	Account execute(@NonNull AccountId accountId);

}
