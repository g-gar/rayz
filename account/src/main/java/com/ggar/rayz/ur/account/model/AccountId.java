package com.ggar.rayz.ur.account.model;

import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class AccountId {

	UUID value;

}
