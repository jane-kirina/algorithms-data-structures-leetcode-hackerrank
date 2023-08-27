package com.company.hackerrank.algorithm.implementation.easy;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = 0, max = 0, minimum = scores.get(0), maximum = minimum;

        for (Integer score : scores) {
            if (score > maximum) {
                max++;
                maximum = score;
            } else if (score < minimum) {
                min++;
                minimum = score;
            }
        }

        return Arrays.asList(max, min);
    }
}
