package com.ggar.rayz.ur.core.certificate.ports;

import com.ggar.rayz.ur.domain.certificate.Certificate;

import java.util.UUID;

public interface CreatePersonalCertificatePort {

	public Certificate run(UUID accountId, String content);

}
