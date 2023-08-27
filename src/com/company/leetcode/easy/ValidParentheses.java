package com.company.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Objects;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> arrayDeque = new ArrayDeque<>();

        if (s.length() == 0) {
            return false;
        }

        for (char chr : s.toCharArray()) {
            if (chr == '(' || chr == '{' || chr == '[') {
                arrayDeque.push(chr);
            } else {
                if (Objects.isNull(arrayDeque.peek())) {
                    return false;
                }
                char top = arrayDeque.peek();

                if (top == '(' && chr == ')'
                        || top == '{' && chr == '}'
                        || top == '[' && chr == ']') {
                    arrayDeque.pop();
                } else {
                    return false;
                }
            }
        }

        return arrayDeque.size() == 0;
    }

    public static boolean isValidMap(String s) {
        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        Deque<Character> arrayDeque = new ArrayDeque<>();

        for (Character character : s.toCharArray()) {
            Character characterPartner = pairs.get(character);

            if (characterPartner == null) {
                arrayDeque.push(character);
            } else if (arrayDeque.size() == 0 || arrayDeque.pop() != characterPartner) {
                return false;
            }

        }
        return arrayDeque.size() == 0;
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");

    }

    private static final String test1 = "()";
    private static final String test2 = "()[]{}";
    private static final String test3 = "]";
    private static final String test4 = "{[]}";
    private static final String test5 = "";
    private static final String test6 = "{()}[]";
    private static final String s = " -> ";

    public static void test() {
        long startTime = System.nanoTime();

        System.out.println(test1 + s + isValid(test1));
        System.out.println(test2 + s + isValid(test2));
        System.out.println(test3 + s + isValid(test3));
        System.out.println(test4 + s + isValid(test4));
        System.out.println(test5 + s + isValid(test5));
        System.out.println(test6 + s + isValid(test6));

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }
}
