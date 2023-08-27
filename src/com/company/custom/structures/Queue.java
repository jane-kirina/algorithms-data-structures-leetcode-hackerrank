package com.company.custom.structures;

import java.util.Objects;

public class Queue<T> {
    private Object[] queue;
    private int front;
    private int back;
    private static final int DEFAULT_CAPACITY = 10;

    public Queue() {
        this.queue = new Object[DEFAULT_CAPACITY];
    }

    public Queue(int capacity) {
        if (capacity <= 0) {
            capacity = DEFAULT_CAPACITY;
        }
        this.queue = new Object[capacity];
    }

    public void add(T t) {
        if (size() == queue.length - 1) {
            int size = size();
            Object[] newQueue = new Object[2 * queue.length];

            System.arraycopy(queue, front, newQueue, 0, queue.length - front);
            System.arraycopy(queue, 0, newQueue, queue.length - front, back);

            queue = newQueue;
            front = 0;
            back = size;
        }

        queue[back] = t;
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }

    public T remove() {
        if (size() == 0) {
            return null;
        }

        T t = getElementData(front);
        queue[front++] = null;

        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }

        return t;
    }

    public T peek() {
        if (size() == 0) {
            return null;
        }
        return getElementData(front);
    }

    public int size() {
        if(front <= back) {
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    public String printStack() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object t : queue) {
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
        return size() == 0;
    }

    @SuppressWarnings("unchecked")
    private T getElementData(int index) {
        if (index < 0) {
            return null;
        }
        return (T) queue[index];
    }
}
