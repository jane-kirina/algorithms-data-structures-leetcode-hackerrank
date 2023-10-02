package com.company.leetcode.hard;

import java.util.Objects;
import java.util.Scanner;

public class BasicCalculator {
    public static int calculate(String s) {
        return -1;
    }


    /**
     * TEST
     **/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Basic Calculator");

        while (flag) {
            String answer = input.nextLine();

            if(Objects.equals(answer.toLowerCase(), "done")) {
                flag = false;
            } else {
                System.out.println(calculate(answer));
            }
        }
    }

}
