package com.lloyds.validator;

import com.lloyds.exception.InvalidTimeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeValidatorTest {

    private TimeValidator timeValidator;

    @Before
    public void setup() {
        timeValidator = new TimeValidator();
    }

    @Test(expected = InvalidTimeException.class)
    public void validateNumericTime() {
        timeValidator.validateNumericTime("20");
    }

    @Test(expected = InvalidTimeException.class)
    public void validateNumericTimeWhenLengthLessThan2() {
        timeValidator.validateNumericTime(":");
    }

    @Test(expected = InvalidTimeException.class)
    public void WhenTimeIsInValid() throws InvalidTimeException {
        timeValidator.validateTime(32, 00);
    }
}