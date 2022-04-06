package com.ggar.rayz.session;

import com.ggar.rayz.common.core.model.Result;
import com.ggar.rayz.session.model.*;

public interface SessionService {

	Result<Session> createSession(Username username, Password password, UserAgent userAgent, RemoteAddress remoteAddress, Long duration);
	Result<Void> closeSession(SessionId sessionId);
}
