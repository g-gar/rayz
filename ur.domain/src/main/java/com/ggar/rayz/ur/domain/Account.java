package com.ggar.rayz.ur.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class Account {

	UUID id;
	Username username;
	Email email;
	PasswordHash passwordHash;
	LocalDate created;
	UserRole role;
	AccountState state;

}
