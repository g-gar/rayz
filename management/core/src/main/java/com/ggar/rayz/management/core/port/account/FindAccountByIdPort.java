package com.ggar.rayz.management.core.port.account;

import com.ggar.rayz.management.core.model.Account;
import com.ggar.rayz.management.core.model.AccountId;
import lombok.NonNull;

public interface FindAccountByIdPort {

	Account execute(@NonNull AccountId accountId);

}
