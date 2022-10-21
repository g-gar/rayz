package com.ggar.rayz.management.core.port.password;

import com.ggar.rayz.management.core.domain.model.Password;
import com.ggar.rayz.management.core.domain.model.PasswordHash;
import lombok.NonNull;

public interface HashPasswordPort {

	PasswordHash execute(@NonNull Password password);

}
