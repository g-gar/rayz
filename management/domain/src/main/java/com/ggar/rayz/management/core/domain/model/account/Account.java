package com.ggar.rayz.management.core.domain.model.account;

import com.ggar.rayz.management.core.domain.model.file.FileStorage;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class Account {

	AccountId accountId;
	Username username;
	Email email;
	PasswordHash passwordHash;
	OffsetDateTime created;
	AccountType role;
	AccountState state;

}
