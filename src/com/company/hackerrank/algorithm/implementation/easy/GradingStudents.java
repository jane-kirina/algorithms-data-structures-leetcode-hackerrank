package com.company.hackerrank.algorithm.implementation.easy;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        int roundNum;
        int odd;
        List<Integer> list = new ArrayList<>();
        for (Integer grade : grades) {
            roundNum = grade % 5;
            odd = 5 - roundNum;
            if (grade > 37 && odd < 3) {
                list.add(grade + odd);
            } else {
                list.add(grade);
            }

        }
        return list;
    }
}
