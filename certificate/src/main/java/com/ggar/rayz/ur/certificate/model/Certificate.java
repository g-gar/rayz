package com.ggar.rayz.ur.certificate.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@With
public class Certificate {

	CertificateId certificateId;
	CertificateType certificateType;
	CertificateAlgorithm certificateAlgorithm;
	List<CertificateKey> certificateKeyList;
	AccountId accountId;

}
