package com.ggar.rayz.management.core.domain.model.file;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class FileStorage {

	FileStorageId fileStorageId;

}
