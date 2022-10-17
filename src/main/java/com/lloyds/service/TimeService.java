package com.lloyds.service;

import org.springframework.stereotype.Service;

import static com.lloyds.util.Clock.*;
import static java.time.LocalDateTime.now;

@Service
public class TimeService {

    public String humanReadableTime() {
        return humanReadableTime(now().getHour(), now().getMinute());
    }

    public String humanReadableTime(int hour, int mins) {
        if (mins == 00) {
            return HOUR_VALUES.get(hour) + " " + MINUTE_VALUES.get(mins);
        } else if (mins <= 30) {
            return capitalise(MINUTE_VALUES.get(mins)) + " past " + HOUR_VALUES.get(hour).toLowerCase();
        }
        return capitalise(MINUTE_VALUES.get(60 - mins)) + " to " + HOUR_VALUES.get(hour + 1).toLowerCase();
    }
}
