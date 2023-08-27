package com.company.hackerrank.algorithm.warmup;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        for (Integer element : ar) {
            sum += element;
        }

        return sum;
    }
}
