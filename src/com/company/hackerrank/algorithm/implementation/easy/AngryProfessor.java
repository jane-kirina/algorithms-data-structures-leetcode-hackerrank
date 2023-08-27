package com.company.hackerrank.algorithm.implementation.easy;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        int arrivedOnTime = 0;

        for (Integer student : a) {
            if (student <= 0) {
                arrivedOnTime++;
                if (arrivedOnTime == k) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
