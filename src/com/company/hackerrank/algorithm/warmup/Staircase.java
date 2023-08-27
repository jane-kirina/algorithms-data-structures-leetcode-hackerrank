package com.company.hackerrank.algorithm.warmup;

public class Staircase {
    // for Java 11
    public static void staircaseSimple(int n) {
        int count = n;
        for (int i = 1; i <= count; i++) {
            System.out.println(" ".repeat(--n) + "#".repeat(i));
        }
    }

    // for Java 8
    public static void staircase(int n) {
        int count = n;
        for (int i = 1; i <= count; i++) {
            String repeatSpace = new String(new char[--n]).replace("\0", " ");
            String repeatStair = new String(new char[i]).replace("\0", "#");

            System.out.println(repeatSpace + repeatStair);
        }
    }
}
