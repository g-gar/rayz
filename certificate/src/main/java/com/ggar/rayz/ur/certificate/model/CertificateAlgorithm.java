package com.ggar.rayz.ur.certificate.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public enum CertificateAlgorithm {

	RSA(0),
	KECCAK_256(1),
	BLOWFISH(2)
	;

	Integer value;

}
