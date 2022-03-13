package com.ggar.rayz.ur.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class Certificate {

	UUID id;
	String content;
	CertificateType certificateType;

}
