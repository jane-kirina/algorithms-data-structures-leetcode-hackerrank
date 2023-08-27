package com.company.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        long startTime2 = System.nanoTime();
        containsDuplicateHashSet(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        long endTime2 = System.nanoTime();
        long durationHashSet = (endTime2 - startTime2);

        long startTime = System.nanoTime();
        containsDuplicateSorting(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        long endTime = System.nanoTime();
        long durationSorting = (endTime - startTime);

        System.out.println("Using HashSet: " + durationHashSet);
        System.out.println("Using sorting: " + durationSorting);
    }
}
