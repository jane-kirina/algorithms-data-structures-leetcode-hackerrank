package com.company.leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {
    static HashMap<Character, Integer> hashMap = new HashMap<>();

    static {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
    }

    public static int romanToIntMap(String s) {
        int result = hashMap.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                result -= hashMap.get(s.charAt(i));
            } else {
                result += hashMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static int romanToIntCase(String s) {
        int answer = 0;
        int number = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        testMap();
        System.out.println("-------------------");
        testCase();
    }

    private static final String test1 = "III";
    private static final String test2 = "LVIII";
    private static final String test3 = "MCMXCIV";
    private static final String s = "Output -> ";

    public static void testMap() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(romanToIntMap(test1));
        System.out.println("3 - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(romanToIntMap(test2));
        System.out.println("58 - Expected");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(romanToIntMap(test3));
        System.out.println("1994 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }

    public static void testCase() {
        long startTime = System.nanoTime();

        System.out.println(test1);
        System.out.println(romanToIntCase(test1));
        System.out.println("3 - Expected");

        System.out.println("-------------------");

        System.out.println(test2);
        System.out.println(romanToIntCase(test2));
        System.out.println("58 - Expected");

        System.out.println("-------------------");

        System.out.println(test3);
        System.out.println(romanToIntCase(test3));
        System.out.println("1994 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
