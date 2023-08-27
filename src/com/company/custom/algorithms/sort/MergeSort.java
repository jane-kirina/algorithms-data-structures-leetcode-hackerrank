package com.company.custom.algorithms.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 123, 3, -1, -7, 30, 23, -65, 14, 30 };
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int middle = (start + end) / 2;

        sort(arr, start, middle);
        sort(arr, middle, end);

        merge(arr, start, middle, end);
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        if (arr[middle - 1] <= arr[middle]) {
            return;
        }

        int i = start;
        int j = middle;
        int tempIndex = 0;

        int[] tempArr = new int[end - start];
        while (i < middle && j < end) {
            tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIndex, middle - i);
        System.arraycopy(tempArr, 0, arr, start, tempIndex);
    }
}
