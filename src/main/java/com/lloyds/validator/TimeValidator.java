package com.lloyds.validator;

import com.lloyds.exception.InvalidTimeException;
import org.springframework.stereotype.Component;

@Component
public class TimeValidator {

    public void validateNumericTime(String numericTime) throws InvalidTimeException {
        if (!numericTime.contains(":") || numericTime.split(":").length != 2) {
            throw new InvalidTimeException("Invalid numeric time format");
        }
    }

    public void validateTime(int hour, int mins) throws InvalidTimeException {
        if (hour < 0 || hour > 23 || mins < 0 || mins > 59) {
            throw new InvalidTimeException("Please Enter valid time -> Valid time  - Hours between 00 and 23  / Mins between 00 and 59");
        }
    }

}
