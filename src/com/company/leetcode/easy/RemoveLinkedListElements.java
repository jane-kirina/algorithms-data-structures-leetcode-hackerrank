package com.company.leetcode.easy;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
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
        nodeA.next.next.next.next.next = new ListNode(6);

        ListNode nodeB = new ListNode();

        ListNode nodeC = new ListNode();
        nodeC.next = new ListNode(7);
        nodeC.next.next = new ListNode(7);
        nodeC.next.next.next = new ListNode(7);
        nodeC.next.next.next.next = new ListNode(7);

        long startTime = System.nanoTime();

        System.out.println(s);
        printList(removeElements(nodeA, 6));
        System.out.println("Expected: [1,2,3,4,5]");

        System.out.println("-------------------");

        System.out.println(s);
        printList(removeElements(nodeB, 1));
        System.out.println("Expected: []");

        System.out.println("-------------------");

        System.out.println(s);
        printList(removeElements(nodeC, 7));
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
