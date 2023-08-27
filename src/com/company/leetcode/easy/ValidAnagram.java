package com.company.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagramSort(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toUpperCase().toCharArray();
        Arrays.sort(sArr);

        char[] tArr = t.toUpperCase().toCharArray();
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static boolean isAnagramArray(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int n : arr) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    /** TEST **/
    public static void main(String[] args) {
        sortTest();
        System.out.println("-------------------");
        arrayTest();
        System.out.println("-------------------");
        mapTest();
    }

    public static void sortTest() {
        long startTime = System.nanoTime();
        System.out.println("'anagram', 'nagaram' - " + isAnagramSort("anagram", "nagaram"));
        System.out.println("'rat', 'car' - " + isAnagramSort("rat", "car"));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }

    public static void arrayTest() {
        long startTime = System.nanoTime();
        System.out.println("'anagram', 'nagaram' - " + isAnagramArray("anagram", "nagaram"));
        System.out.println("'rat', 'car' - " + isAnagramArray("rat", "car"));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }

    public static void mapTest() {
        long startTime = System.nanoTime();
        System.out.println("'anagram', 'nagaram' - " + isAnagramHashMap("anagram", "nagaram"));
        System.out.println("'rat', 'car' - " + isAnagramHashMap("rat", "car"));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }


}
