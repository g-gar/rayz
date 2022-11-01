package com.ggar.rayz.management.core.port.account;

import com.ggar.rayz.management.core.domain.model.account.Account;
import lombok.NonNull;

public interface CreateAccountPort {

	Account execute(@NonNull Account account);

}
