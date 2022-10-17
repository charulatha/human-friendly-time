package com.lloyds.handler;

import com.lloyds.exception.InvalidTimeException;
import com.lloyds.service.TimeService;
import com.lloyds.validator.TimeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TimeHandler {

    private TimeValidator validator;

    private TimeService timeService;

    @Autowired
    public TimeHandler(TimeValidator validator, TimeService timeService) {
        this.validator = validator;
        this.timeService = timeService;
    }

    public String handle(String args[]) throws InvalidTimeException {
        if (args.length != 0) {
            return humanReadableTime(args[0]);
        }
        return timeService.humanReadableTime();
    }


    public String handle(Optional<String> numericTime) throws InvalidTimeException {
        if (numericTime.isPresent()) {
            return humanReadableTime(numericTime.get());
        }
        return timeService.humanReadableTime();
    }

    private String humanReadableTime(String time) throws InvalidTimeException {
        validator.validateNumericTime(time);

        String[] splitTime = time.split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int mins = Integer.parseInt(splitTime[1]);

        validator.validateTime(hour, mins);

        return timeService.humanReadableTime(hour, mins);
    }
}
