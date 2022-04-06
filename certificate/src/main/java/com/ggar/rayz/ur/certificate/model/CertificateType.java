package com.ggar.rayz.ur.certificate.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum CertificateType {

	ASYMMETRIC(0),
	SYMMETRIC(1);

	Integer value;
}
