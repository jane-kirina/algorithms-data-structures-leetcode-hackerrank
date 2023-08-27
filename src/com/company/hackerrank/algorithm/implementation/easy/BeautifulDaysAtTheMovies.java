package com.company.hackerrank.algorithm.implementation.easy;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        StringBuilder temp;

        for (; i <= j; i++) {
            temp = new StringBuilder();
            temp.append(i);
            temp.reverse();

            if (0 == (Math.abs(Integer.parseInt(String.valueOf(temp)) - i) % k)) {
                beautifulDays++;
            }
        }

        return beautifulDays;
    }

    public static void main(String[] args) {
        beautifulDays(20, 23, 6);
    }
}
