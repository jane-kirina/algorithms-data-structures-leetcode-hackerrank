package com.company.custom.algorithms.sort;

import java.util.Arrays;

public class Bogosort {
    public static void main(String[] args) {
        int[] arr = {123, 3, -1, -7, 30, 23, -65, 14, 30, 14, 38};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length; i++) {
                swap(arr, i, (int)(Math.random() * i));
            }
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
