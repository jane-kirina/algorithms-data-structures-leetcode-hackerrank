package com.company.custom.algorithms.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {123, 3, -1, -7, 30, -1, 23, -65, 14, 30};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int value = 0;
        int i = 0;
        for (int firstIndex = 1; firstIndex < arr.length; firstIndex++) {
            value = arr[firstIndex];
            for (i = firstIndex; i > 0 && arr[i - 1] > value; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = value;
        }
    }
}
