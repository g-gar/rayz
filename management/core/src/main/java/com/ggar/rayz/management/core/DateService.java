package com.ggar.rayz.management.core;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public interface DateService {

	default OffsetDateTime getDateTime(ZoneId zoneId) {
		return LocalDateTime.now().atZone(zoneId).toOffsetDateTime();
	}

}
