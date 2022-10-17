package com.lloyds.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeServiceTest {

    private TimeService timeService;

    @Before
    public void setup() {
        timeService = new TimeService();
    }

    @Test
    public void humanReadableTime_GivenTimeAs1030_ShouldReturnHalfPastOne() {
        String formattedInWords = timeService.humanReadableTime(10, 30);
        Assert.assertEquals("Half past ten", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs11_15_ShouldReturn_QuarterPastEleven() {
        String formattedInWords = timeService.humanReadableTime(11, 15);
        Assert.assertEquals("Quarter past eleven", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs11_45_ShouldReturn_QuarterToTwelve() {
        String formattedInWords = timeService.humanReadableTime(11, 45);
        Assert.assertEquals("Quarter to twelve", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs1_00_ShouldReturn_One_O_Clock() {
        String formattedInWords = timeService.humanReadableTime(1, 00);
        Assert.assertEquals("One o'clock", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs21_00_ShouldReturn_Nine_O_Clock() {
        String formattedInWords = timeService.humanReadableTime(21, 00);
        Assert.assertEquals("Nine o'clock", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs_23_15_ShouldReturn_QuarterPastEleven() {
        String formattedInWords = timeService.humanReadableTime(23, 15);
        Assert.assertEquals("Quarter past eleven", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs_00_00_ShouldReturn_Twelve_O_Clock() {
        String formattedInWords = timeService.humanReadableTime(00, 00);
        Assert.assertEquals("Twelve o'clock", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs12_00_ShouldReturn_Twelve_O_Clock() {
        String formattedInWords = timeService.humanReadableTime(12, 00);
        Assert.assertEquals("Twelve o'clock", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs00_28_ShouldReturn_TwentyEightMinutesPastTwelve() {
        String formattedInWords = timeService.humanReadableTime(00, 28);
        Assert.assertEquals("Twenty eight minutes past twelve", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs00_32_ShouldReturn_TwentyEightMinutesToOne() {
        String formattedInWords = timeService.humanReadableTime(00, 32);
        Assert.assertEquals("Twenty eight minutes to one", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs23_55_ShouldReturn_FiveMinutesToTwelve() {
        String formattedInWords = timeService.humanReadableTime(23, 55);
        Assert.assertEquals("Five minutes to twelve", formattedInWords);
    }

    @Test
    public void humanReadableTime_GivenTimeAs00_5_ShouldReturn_FiveMinutesPastTwelve() {
        String formattedInWords = timeService.humanReadableTime(00, 5);
        Assert.assertEquals("Five minutes past twelve", formattedInWords);
    }
}