package com.company.custom.structures;

import java.util.Objects;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Integer length;

    public LinkedList(T firstElement) {
        Node<T> node = new Node<>(firstElement);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

    public String printList() {
        StringBuilder list = new StringBuilder();
        Node<T> temp = head;
        list.append("[");
        while (Objects.nonNull(temp)) {
            list.append(temp.element);
            temp = temp.next;
            if (Objects.nonNull(temp)) {
                list.append(", ");
            }
        }
        list.append("]");

        return list.toString();
    }

    public boolean append(T element) {
        Node<T> node = new Node<>(element);
        if (Objects.isNull(this.head)) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
        this.length += 1;
        return true;
    }

    public T popup() {
        if (Objects.isNull(this.head)) {
            return null;
        }
        Node<T> temp = this.head;
        Node<T> pre = this.head;
        while (Objects.nonNull(temp.next)) {
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        this.length -= 1;
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return pre.element;
    }

    public boolean prepend(T element) {
        Node<T> node = new Node<>(element);
        if (Objects.isNull(this.head)) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.length += 1;
        return true;
    }

    public T popupFirst() {
        if (Objects.isNull(this.head)) {
            return null;
        }
        Node<T> temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length -= 1;
        if (this.length == 0) {
            this.tail = null;
        }
        return temp.element;
    }

    public T get(Integer index) {
        Node<T> node = getNode(index);
        return Objects.isNull(node) ? null : node.element;
    }

    public boolean set(Integer index, T value) {
        Node<T> node = getNode(index);
        if (Objects.nonNull(node)) {
            node.element = value;
            return true;
        }
        return false;
    }

    public boolean insert(Integer index, T value) {
        if(index < 0 || index >= this.length) {
            return false;
        }
        if (index == 0) {
            return prepend(value);
        }
        if (index.equals(this.length - 1)) {
            return append(value);
        }
        Node<T> node = new Node<>(value);
        Node<T> pre = getNode(index-1);
        node.next = pre.next;
        pre.next = node;
        this.length += 1;
        return true;
    }

    public T remove(Integer index) {
        if(index < 0 || index >= this.length) {
            return null;
        }
        if (index == 0) {
            return popupFirst();
        }
        if (index == this.length - 1) {
            return popup();
        }
        Node<T> pre = getNode(index - 1);
        Node<T> temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        this.length -= 1;

        return temp.element;
    }

    public void reverse() {//doesn't work
        Node<T> temp = this.head;
        this.tail = this.head;
        this.tail = temp;
        Node<T> next = temp.next;
        Node<T> prev = null;
        for (int i = 0; i < this.length; i++) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
    }

    public void clean() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public T getFirstElement() {
        return Objects.isNull(this.head) ? null : this.head.element;
    }

    public T getLastElement() {
        return Objects.isNull(this.tail) ? null : this.tail.element;
    }

    public Integer size() {
        return this.length;
    }

    private Node<T> getNode(Integer index) {
        if(index < 0 || index >= this.length) {
            return null;
        }
        Node<T> temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
        }
    }
}
