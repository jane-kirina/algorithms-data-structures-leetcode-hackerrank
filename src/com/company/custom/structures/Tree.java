package com.company.custom.structures;

import java.util.Objects;

public class Tree {

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public String traverseInOrder() {
        String data = null;
        if (root != null) {
            data = root.traverseInOrder(new StringBuilder());
        }
        return data;
    }

    public String traversePreOrder() {
        String data = null;
        if (root != null) {
            data = root.traversePreOrder(new StringBuilder());
        }
        return data;
    }

    public Integer get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node subRoot, int value) {
        if(Objects.isNull(subRoot)) {
            return subRoot;
        }

        if (value<subRoot.getData()) {
            subRoot.setLeft(delete(subRoot.getLeft(),value));
        } else if (value > subRoot.getData()) {
            subRoot.setRight(delete(subRoot.getRight(), value));
        }
        else {
            //Tree has 0 or 1 child
            if(Objects.isNull(subRoot.getLeft())) {
                return subRoot.getRight();
            } else if (Objects.isNull(subRoot.getRight())) {
                return subRoot.getLeft();
            }
            //Tree has 2 children
            subRoot.setData(subRoot.getRight().min());
            subRoot.setRight(delete(subRoot.getRight(), subRoot.getData()));
        }

        return subRoot;
    }

    private static class Node {

        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public void insert(int value) {
            if (Objects.equals(value, getData())) {
                return;
            }

            if (value < getData()) {
                if (Objects.equals(getLeft(), null)) {
                    setLeft(new Node(value));
                } else {
                    getLeft().insert(value);
                }
            } else {
                if (Objects.equals(getRight(), null)) {
                    setRight(new Node(value));
                } else {
                    getRight().insert(value);
                }
            }
        }

        public String traverseInOrder(StringBuilder sb) {
            if (Objects.nonNull(getLeft())) {
                getLeft().traverseInOrder(sb);
            }
            sb.append(getData()).append(", ");
            if (Objects.nonNull(getRight())) {
                getRight().traverseInOrder(sb);
            }

            return sb.substring(0, sb.length() - 2);
        }

        public String traversePreOrder(StringBuilder sb) {
            sb.append(getData()).append(", ");

            if (Objects.nonNull(getLeft())) {
                getLeft().traversePreOrder(sb);
            }
            if (Objects.nonNull(getRight())) {
                getRight().traversePreOrder(sb);
            }

            return sb.substring(0, sb.length() - 2);
        }

        public Integer get(int value) {
            if (value == getData()) {
                return this.getData();
            }

            if (value < getData()) {
                if (getLeft() != null) {
                    return getLeft().get(value);
                }
            } else {
                if (getRight()!= null) {
                    return getRight().get(value);
                }
            }
            return null;
        }


        public int min() {
            if (Objects.isNull(getLeft())) {
                return getData();
            } else {
                return getLeft().max();
            }
        }

        public int max() {
            if (Objects.isNull(getRight())) {
                return getData();
            } else {
                return getRight().max();
            }
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
