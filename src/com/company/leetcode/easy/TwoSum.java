package com.company.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumSimple(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (!(i == j) && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        long startTime2 = System.nanoTime();
        twoSumSimple(new int[]{4, 5, 9, 5, 7}, 10);
        long endTime2 = System.nanoTime();
        long durationSimple = (endTime2 - startTime2);

        long startTime = System.nanoTime();
        twoSumMap(new int[]{4, 5, 9, 5, 7}, 10);
        long endTime = System.nanoTime();
        long durationHashMap = (endTime - startTime);

        System.out.println("Simple: " + durationSimple);
        System.out.println("HashMap: " + durationHashMap);
    }
}
