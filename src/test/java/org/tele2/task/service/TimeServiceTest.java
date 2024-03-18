package org.tele2.task.service;

import org.junit.jupiter.api.Test;
import org.tele2.task.dto.TimeDto;

import java.time.LocalTime;
import java.time.ZoneId;

import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeServiceTest {

    private final TimeService timeService = new TimeService();

    @Test
    void getCurrentTime_ReturnsCorrectCurrentTime() {
        TimeDto expected = TimeDto.builder()
                .timezone(ZoneId.systemDefault())
                .time(LocalTime.now().truncatedTo(SECONDS))
                .build();

        TimeDto actual = timeService.getCurrentTime();

        assertEquals(expected, actual);
    }
}