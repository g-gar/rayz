package com.ggar.rayz.management.core.port.password;

import com.ggar.rayz.management.core.model.Password;
import com.ggar.rayz.management.core.model.PasswordHash;
import lombok.NonNull;

public interface HashPasswordPort {

	PasswordHash execute(@NonNull Password password);

}
