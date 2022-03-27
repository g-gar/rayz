package com.ggar.rayz.ur.domain.certificate;

import com.ggar.rayz.ur.domain.account.AccountId;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.UUID;

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
