package com.company.hackerrank.algorithm.warmup;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int size = arr.size();

        for (Integer num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println((float) positive/size);
        System.out.println((float) negative/size);
        System.out.println((float) zero/size);
    }
}
