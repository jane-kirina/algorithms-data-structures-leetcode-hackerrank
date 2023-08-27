package com.company.custom.dynamicProgramming;

public class FlowerBox {
    public static int flower(int[] nutrient) {
        int a = 0;
        int b = 0;
        int temp = 0;

        for (int n : nutrient) {
            temp = a;
            a = b;
            b = Math.max(temp + n, b);
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println("{3, 10, 3, 1, 2}: " + flower(new int[]{3, 10, 3, 1, 2}));
        System.out.println("{9, 10, 9}: " + flower(new int[]{9, 10, 9}));
    }
}
