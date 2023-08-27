package com.company.hackerrank.algorithm.implementation.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birds = new HashMap<>();

        for (Integer birdId : arr) {
            if (!birds.containsKey(birdId)) {
                birds.put(birdId, 1);
            } else {
                birds.put(birdId, birds.get(birdId) + 1);
            }
        }

        return Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
