package com.company.hackerrank.algorithm.warmup;

import java.util.Arrays;
import java.util.List;

class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;

        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                alice++;
            } else if(a.get(i) < b.get(i)) {
                bob++;
            }
        }

        return Arrays.asList(alice, bob);
    }
}
