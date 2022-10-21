package com.ggar.rayz.management.core.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class Account {

	AccountId id;
	Username username;
	Email email;
	PasswordHash passwordHash;
	OffsetDateTime created;
	AccountType role;
	AccountState state;

}
