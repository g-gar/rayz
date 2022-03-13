package com.ggar.rayz.ur.core;

import com.ggar.rayz.ur.domain.*;

import java.util.List;
import java.util.UUID;

public interface RayzUR {

	public Account create(Username username, Password password, Email email, UserRole userRole);

	public Certificate assignCertificate(UUID accountId, Certificate certificate);

	public List<Certificate> getCertificates(UUID accountId, CertificateType certificateType);

}
