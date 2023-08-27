package com.company.custom.structures;

import java.util.NoSuchElementException;
import java.util.Objects;

public class DynamicArray<T> {
    private Object[] list;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static final int RESIZE = 2;

    public DynamicArray() {
        this.list = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public DynamicArray(int capacity) {
        if (capacity <= 0) {
            capacity = DEFAULT_CAPACITY;
        }
        this.list = new Object[capacity];
        this.size = 0;
    }

    public void add(T object) {
        if (size == list.length) {
            resize();
        }
        list[size] = object;
        size++;
    }

    public void add(T object, int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (size == list.length || index >= list.length) {
            resize();
        }
        System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = object;
        ++size;
    }

    public Object set(Object object, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object temp = list[index];
        list[index] = object;
        return temp;
    }

    public void clear() {
        this.list = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contains(Object objrct) {
        return indexOf(objrct) >= 0;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int index) {
        if (index < list.length && index >= 0) {
            return list[index];
        } else {
            throw new IndexOutOfBoundsException(index);
        }
    }

    public boolean remove(Object object) {
        if (Objects.isNull(object)) {
            throw new NoSuchElementException();
        }
        int index = indexOf(object);
        if (index == -1) {
            return false;
        }

        list[index] = null;
        size--;

        return true;
    }

    public T remove(int index) {
        if (index < 0) {
            return null;
        }

        if (index > size) {
            throw new IndexOutOfBoundsException();
        }

        T temp = getElementData(index);
        list[index] = null;

        return temp;
    }

    private void resize() {
        Object[] newList = new Object[list.length * 3 / 2];
        System.arraycopy(list, 0, newList, 0, list.length);
        list = newList;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object t : list) {
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

    @SuppressWarnings("unchecked")
    private T getElementData(int index) {
        if (index < 0) {
            return null;
        }
        return (T) list[index];
    }
}
