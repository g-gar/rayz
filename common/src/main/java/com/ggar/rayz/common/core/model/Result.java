package com.ggar.rayz.common.core.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class Result<E> implements ResultBase<E> {

	ResultCode resultCode;
	E underlyingResultObject;

}
