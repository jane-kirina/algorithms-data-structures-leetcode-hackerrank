package com.company.custom.algorithms.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {123, 3, -1, -7, 30, 23, -65, 14, 30};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int largestIndex = 0;
        for (int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(arr, largestIndex, lastIndex);
        }
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
