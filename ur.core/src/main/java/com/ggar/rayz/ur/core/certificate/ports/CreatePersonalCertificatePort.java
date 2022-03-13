package com.ggar.rayz.ur.core.certificate.ports;

import com.ggar.rayz.ur.domain.Certificate;
import com.ggar.rayz.ur.domain.CertificateType;

import java.util.UUID;

public interface CreatePersonalCertificatePort {

	public Certificate run(UUID accountId, String content);

}
