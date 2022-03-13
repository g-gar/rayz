package com.ggar.rayz.ur.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class SharedCertificate {

	UUID id;
	String content;
	CertificateType certificateType;
	UUID producer;
	List<UUID> consumerList;

}
