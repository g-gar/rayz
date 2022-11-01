package com.ggar.rayz.management.core.domain.model.account;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum AccountState {

	INVALID(null),
	CREATING(0),
	CREATED(1),
	ENABLED(2),
	DISABLED(4),
	DELETED(8);

	Integer value;
}
