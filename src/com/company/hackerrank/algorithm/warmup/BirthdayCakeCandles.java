package com.company.hackerrank.algorithm.warmup;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int height = candles.get(0);
        int count = 1;
        int next;

        for (int i = 0; i < candles.size() - 1; i++) {
            next = candles.get(i + 1);
            if (height < next) {
                height = next;
                count = 1;
            } else if (height == next) {
                count++;
            }
        }

        return count;
    }
}
