package com.ggar.rayz.management.core.port.account;

import com.ggar.rayz.management.core.domain.model.Account;
import lombok.NonNull;

public interface UpdateAccountPort {

	Account execute(@NonNull Account account);

}
