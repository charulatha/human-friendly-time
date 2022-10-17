package com.lloyds;

import com.lloyds.exception.InvalidTimeException;
import com.lloyds.handler.TimeHandler;
import com.lloyds.service.TimeService;
import com.lloyds.validator.TimeValidator;

public class HumanFriendlyTime {

    public static void main(String[] args) {
        TimeValidator timeValidator = new TimeValidator();
        TimeService timeService = new TimeService();
        TimeHandler timeHandler = new TimeHandler(timeValidator, timeService);

        try {
            System.out.println(timeHandler.handle(args));
        } catch (InvalidTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
