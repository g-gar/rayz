package com.ggar.rayz.ur.core.service;

import com.ggar.rayz.ur.core.model.Result;
import com.ggar.rayz.ur.domain.account.Password;
import com.ggar.rayz.ur.domain.account.Username;
import com.ggar.rayz.ur.domain.session.RemoteAddress;
import com.ggar.rayz.ur.domain.session.Session;
import com.ggar.rayz.ur.domain.session.SessionId;
import com.ggar.rayz.ur.domain.session.UserAgent;

import java.util.UUID;

public interface LoginService {

	Result<Void> tryLogin(Username username, Password password);
	Result<Session> createSession(Username username, Password password, UserAgent userAgent, RemoteAddress remoteAddress, Long duration);
	Result<Void> closeSession(SessionId sessionId);
}
