package com.company.hackerrank.algorithm.warmup;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int right = 0;
        int left = 0;

        for (int i = 0, j  = arr.size()-1; i < arr.size(); i++, j--) {
            List<Integer> list = arr.get(i);
            right += list.get(i);
            left += list.get(j);
        }

        return Math.abs(right-left);
    }
}
