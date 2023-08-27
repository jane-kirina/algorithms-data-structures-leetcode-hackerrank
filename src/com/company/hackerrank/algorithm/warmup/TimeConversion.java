package com.company.hackerrank.algorithm.warmup;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static String timeConversion(String s) {
        LocalTime dateTime = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        return dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }
}
