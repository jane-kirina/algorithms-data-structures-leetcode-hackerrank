package com.company.leetcode.easy;

import java.math.BigInteger;

public class AddBinary {
    public static String addBinaryNaive(String a, String b) {
        BigInteger numA = new BigInteger(a, 2);
        BigInteger numB = new BigInteger(b, 2);
        return numA.add(numB).toString(2);
    }

    /*
          1+1=0 with carry 1
          1+0=1 with carry 0
          0+1=1 with carry 0
          0+0=0 with carry 0
     */
    public static String addBinary(String a, String b) {
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int carry = 0;
        String result = "";
        int maxLength = Math.max(lengthA, lengthB);
        for (int i = 0; i < maxLength; i++) {
            int p = i < lengthA ? a.charAt(lengthA - 1 - i) - '0' : 0;
            int q = i < lengthB ? b.charAt(lengthB - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            result = tmp % 2 + result;
        }
        return (carry == 0) ? result : "1" + result;
    }



    /**
     * TEST
     **/
    public static void main(String[] args) {
        long duration = test();
        System.out.println("-------------------");
        System.out.println("Duration : " + duration);
    }

    private static final String test1A = "11";
    private static final String test1B = "1";
    private static final String test2A = "1010";
    private static final String test2B = "1011";
    private static final String test3A = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
    private static final String test3B = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

    public static long test() {
        long startTime = System.nanoTime();

        System.out.println(test1A + " " + test1B);
        System.out.println(addBinary(test1A, test1B));
        System.out.println("100 - Expected");

        System.out.println("-------------------");

        System.out.println(test2A + " " + test2B);
        System.out.println(addBinary(test2A, test2B));
        System.out.println("10101 - Expected");

        System.out.println("-------------------");

        System.out.println(test3A + " " + test3B);
        System.out.println(addBinary(test3A, test3B));
        System.out.println("10101 - Expected");

        System.out.println("-------------------");

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
