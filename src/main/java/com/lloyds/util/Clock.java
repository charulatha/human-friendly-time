package com.lloyds.util;

import java.util.HashMap;
import java.util.Map;

public class Clock {
    public static Map<Integer, String> HOUR_VALUES = new HashMap<Integer, String>() {{
        put(0, "Twelve");
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");
        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "One");
        put(14, "Two");
        put(15, "Three");
        put(16, "Four");
        put(17, "Five");
        put(18, "Six");
        put(19, "Seven");
        put(20, "Eight");
        put(21, "Nine");
        put(22, "Ten");
        put(23, "Eleven");
        put(24, "Twelve");
    }};

    public static Map<Integer, String> MINUTE_VALUES = new HashMap<Integer, String>() {{
        put(0, "o'clock");
        put(1, "one minute");
        put(2, "two minutes");
        put(3, "three minutes");
        put(4, "four minutes");
        put(5, "five minutes");
        put(6, "six minutes");
        put(7, "seven minutes");
        put(8, "eight minutes");
        put(9, "nine minutes");
        put(10, "ten minutes");
        put(11, "eleven minutes");
        put(12, "twelve minutes");
        put(13, "thirteen minutes");
        put(14, "fourteen minutes");
        put(15, "quarter");
        put(16, "sixteen minutes");
        put(17, "seventeen minutes");
        put(18, "eighteen minutes");
        put(19, "nineteen minutes");
        put(20, "twenty minutes");
        put(21, "twenty one minutes");
        put(22, "twenty two minutes");
        put(23, "twenty three minutes");
        put(24, "twenty four minutes");
        put(25, "twenty five minutes");
        put(26, "twenty six minutes");
        put(27, "twenty seven minutes");
        put(28, "twenty eight minutes");
        put(29, "twenty nine minutes");
        put(30, "half");
    }};

    public static String capitalise(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
