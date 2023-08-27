package com.company.custom.algorithms.search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {123, 3, -1, -7, 30, 23, -65, 14, 30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("23 - " + search(arr, 23));
        System.out.println("-1 - " + search(arr, -1));
        System.out.println("30 - " + search(arr, 30));
        System.out.println("123 - " + search(arr, 123));
    }

    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
