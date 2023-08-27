package com.company.hackerrank.algorithm.implementation.easy;

import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int countOfWays = 0;
        int temp;

        for (int i = 0; i <= s.size() - m; i++) {
            temp = s.get(i);
            for (int j = i + 1; j < m + i; j++) {
                temp += s.get(j);
            }
            if (temp == d) countOfWays++;
        }

        return countOfWays;
    }
}
