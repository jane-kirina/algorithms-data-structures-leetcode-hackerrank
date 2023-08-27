package com.company.leetcode.easy;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode dump = head;
        ListNode result = null;
        ListNode next = null;

        while (dump != null) {
            next = dump.next;
            dump.next = result;
            result = dump;
            dump = next;
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * TEST
     **/
    public static void main(String[] args) {
        test();
        System.out.println("-------------------");

    }

    private static final String s = "Output -> ";

    public static void test() {
        ListNode nodeA = new ListNode(1);
        nodeA.next = new ListNode(2);
        nodeA.next.next = new ListNode(3);
        nodeA.next.next.next = new ListNode(4);
        nodeA.next.next.next.next = new ListNode(5);

        ListNode nodeB = new ListNode(1);
        nodeB.next = new ListNode(2);

        ListNode nodeC = new ListNode();

        long startTime = System.nanoTime();

        System.out.println(s);
        printList(reverseList(nodeA));
        System.out.println("Expected: [5,4,3,2,1]");

        System.out.println("-------------------");

        System.out.println(s);
        printList(reverseList(nodeB));
        System.out.println("Expected: [2,1]");

        System.out.println("-------------------");

        System.out.println(s);
        printList(reverseList(nodeC));
        System.out.println("Expected: []");

        System.out.println("-------------------");

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Duration: " + duration);
    }


    public static void printList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
