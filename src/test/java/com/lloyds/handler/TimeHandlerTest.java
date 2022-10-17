package com.lloyds.handler;

import com.lloyds.exception.InvalidTimeException;
import com.lloyds.service.TimeService;
import com.lloyds.validator.TimeValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

public class TimeHandlerTest {

    private TimeHandler timeHandler;

    @Before
    public void setup() {
        timeHandler = new TimeHandler(new TimeValidator(), new TimeService());
    }

    @Test
    public void givenNumericTimeAsArgs_ShouldReturnHumanReadableTime() throws InvalidTimeException {
        Assert.assertEquals(timeHandler.handle(new String[]{"22:12"}),"Twelve minutes past ten");
    }

    @Test
    public void givenNumericTime_ShouldReturnHumanReadableTime() throws InvalidTimeException {
        Assert.assertEquals(timeHandler.handle(Optional.of("22:12")),"Twelve minutes past ten");
    }

    @Test
    public void givenNoTimeAsEmptyArgs_ShouldReturnHumanReadableSystemTime() throws InvalidTimeException {
        String result = timeHandler.handle(new String[]{});
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    public void givenNoTime_ShouldReturnHumanReadableSystemTime() throws InvalidTimeException {
        String result = timeHandler.handle(Optional.empty());
        System.out.println(result);
        Assert.assertNotNull(result);
    }



}