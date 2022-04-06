package com.ggar.rayz.ur.account.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum AccountState {

	INVALID(null),
	CREATED(0),
	ENABLED(1),
	DISABLED(2),
	DELETED(3);

	Integer value;
}
