package com.company.hackerrank.algorithm.implementation.easy;

import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int temp;

        for (int i = 0; i < n; i++) {
            temp = ar.get(i);
            for (int j = i; j < n; j++) {
                if ((temp + ar.get(j)) % k == 0 && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
