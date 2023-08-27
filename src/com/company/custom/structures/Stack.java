package com.company.custom.structures;

import java.util.Objects;

public class Stack<T> {
    private Object[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        this.stack = new Object[DEFAULT_CAPACITY];
    }

    public Stack(int capacity) {
        if (capacity <= 0) {
            capacity = DEFAULT_CAPACITY;
        }
        this.stack = new Object[capacity];
    }

    public void push(T t) {
        if (top == stack.length) {
            Object[] newStack = new Object[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = t;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T t = getElementData(--top);
        stack[top] = null;

        return t;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return getElementData(top - 1);
    }

    public int size() {
        return top;
    }

    public String printStack() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object t : stack) {
            if (Objects.nonNull(t)) {
                sb.append(t).append(", ");
            }
        }
        if (!isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");

        return sb.toString();
    }

    public boolean isEmpty() {
        return top == 0;
    }

    @SuppressWarnings("unchecked")
    private T getElementData(int index) {
        if (index < 0) {
            return null;
        }
        return (T) stack[index];
    }
}
