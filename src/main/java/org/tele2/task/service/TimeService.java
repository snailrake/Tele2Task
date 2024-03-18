package org.tele2.task.service;

import org.springframework.stereotype.Service;
import org.tele2.task.dto.TimeDto;

import java.time.LocalTime;
import java.time.ZoneId;

import static java.time.temporal.ChronoUnit.SECONDS;

@Service
public class TimeService {

    public TimeDto getCurrentTime() {
        return TimeDto.builder()
                .timezone(ZoneId.systemDefault())
                .time(LocalTime.now().truncatedTo(SECONDS))
                .build();
    }
}