package com.ggar.rayz.management.core.domain.model.file;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class FileMetadata {

	FileMetadataId fileMetadataId;
	@Builder.Default
	Set<FileFlag> flagSet = new HashSet<>();
	OffsetDateTime created;
	// access log

}
