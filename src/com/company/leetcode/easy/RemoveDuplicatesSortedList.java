package com.company.leetcode.easy;

public class RemoveDuplicatesSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        if (head == null) {
            return null;
        }

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
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
        nodeA.next = new ListNode(1);
        nodeA.next.next = new ListNode(2);

        ListNode nodeB = new ListNode();
        nodeB.next = new ListNode(1);
        nodeB.next.next = new ListNode(1);
        nodeB.next.next.next = new ListNode(2);
        nodeB.next.next.next.next = new ListNode(3);
        nodeB.next.next.next.next.next = new ListNode(3);

        long startTime = System.nanoTime();

        System.out.println(s);
        printList(deleteDuplicates(nodeA));
        System.out.println("Expected: [1,2]");

        System.out.println("-------------------");

        System.out.println(s);
        printList(deleteDuplicates(nodeB));
        System.out.println("Expected: [1,2,3]");

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
