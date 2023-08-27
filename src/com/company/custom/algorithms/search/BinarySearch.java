package com.company.custom.algorithms.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {123, 3, -1, -7, 30, 23, -65, 14, 30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Iterative");
        System.out.println("23 - " + iterativeSearch(arr, 23));
        System.out.println("-1 - " + iterativeSearch(arr, -1));
        System.out.println("30 - " + iterativeSearch(arr, 30));
        System.out.println("12 - " + iterativeSearch(arr, 12));

        System.out.println("Recursive");
        System.out.println("23 - " + iterativeSearch(arr, 23));
        System.out.println("-1 - " + iterativeSearch(arr, -1));
        System.out.println("30 - " + iterativeSearch(arr, 30));
        System.out.println("12 - " + iterativeSearch(arr, 12));
    }

    public static int iterativeSearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length;
        int middle = 0;

        while (start < end) {
            middle = (start + end) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (arr[middle] < value) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return -1;
    }

    public static int recurseSearch(int[] arr, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int middle = (start + end) / 2;

        if(arr[middle] == value){
            return middle;
        } else if (arr[middle] < value) {
            return recurseSearch(arr, middle+1, end, value);
        } else {
            return recurseSearch(arr, start, middle, value);
        }
    }

    public static int recursiveSearch(int[] arr, int value) {
        return recurseSearch(arr, 0, arr.length, value);

    }
}
