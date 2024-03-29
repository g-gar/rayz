package com.ggar.rayz.management.core.domain.model.file;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class FileStorageId {

	@Builder.Default
	UUID value = UUID.randomUUID();

}
