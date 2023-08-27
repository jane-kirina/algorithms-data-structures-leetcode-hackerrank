package com.company.hackerrank.algorithm.warmup;

import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        Long sum = 0L;

        for (Long element : ar) {
            sum += element;
        }

        return sum;
    }
}
