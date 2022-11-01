package com.ggar.rayz.management.core.port.password;

import com.ggar.rayz.management.core.domain.model.account.Password;
import com.ggar.rayz.management.core.domain.model.account.PasswordHash;
import lombok.NonNull;

public interface HashPasswordPort {

	PasswordHash execute(@NonNull Password password);

}
