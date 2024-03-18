package org.tele2.task.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tele2.task.dto.TimeDto;
import org.tele2.task.service.TimeService;

@RestController
@RequiredArgsConstructor
public class TimeController {

    private final TimeService timeService;

    @GetMapping("/time")
    public TimeDto getCurrentTime() {
        return timeService.getCurrentTime();
    }
}