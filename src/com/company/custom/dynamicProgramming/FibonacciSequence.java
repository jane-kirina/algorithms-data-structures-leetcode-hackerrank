package com.company.custom.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {
    // recursion
    public static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    // memorize
    public static int fibMemorize(int n) {
        HashMap<Integer, Integer> memoizedMap = new HashMap<>();

        memoizedMap.put(0, 0);
        memoizedMap.put(1, 1);

        return fib(n, memoizedMap);
    }

    private static int fib(int num, Map<Integer, Integer> map) {
        if (map.containsKey(num)) {
            return map.get(num);
        }

        int result = fib(num - 1, map) + fib(num - 2, map);
        map.put(num, result);

        return result;
    }

    
    /**
     * TEST
     **/
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println("Expected: 2. Result: " + fib(3));
        System.out.println("Expected: 8. Result: " + fib(6));
        System.out.println("Expected: 55. Result: " + fib(10));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("-------------------");

        long startTime2 = System.nanoTime();

        System.out.println("Expected: 2. Result: " + fibMemorize(3));
        System.out.println("Expected: 8. Result: " + fibMemorize(6));
        System.out.println("Expected: 55. Result: " + fibMemorize(10));
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        System.out.println("-------------------");
        System.out.println("Duration simple: " + duration);
        System.out.println("Duration map:    " + duration2);
    }
}
