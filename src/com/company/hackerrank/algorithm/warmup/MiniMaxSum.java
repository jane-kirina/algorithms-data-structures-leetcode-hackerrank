package com.company.hackerrank.algorithm.warmup;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static String solutionWithIteration(List<Integer> arr) {
        long sum = 0;

        for (Integer num : arr) {
            sum += num;
        }

        long min = sum - Collections.max(arr);
        long max = sum - Collections.min(arr);

        return min + " " + max;
    }

    public static String solutionWithSort(List<Integer> arr) {
        long sum = 0;

        Collections.sort(arr);

        for (Integer num : arr) {
            sum += num;
        }

        long min = sum - arr.get(arr.size() - 1);
        long max = sum - arr.get(0);

        return min + " " + max;
    }
}
