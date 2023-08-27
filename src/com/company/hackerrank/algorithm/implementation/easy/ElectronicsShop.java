package com.company.hackerrank.algorithm.implementation.easy;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int canSpent = -1;
        int temp;
        int budget;

        for (int keyboard : keyboards) {
            temp = keyboard;
            for (int drive : drives) {
                budget = temp + drive;
                if (budget > canSpent && budget <= b) {
                    canSpent = budget;
                }
            }
        }

        return canSpent;
    }
}
