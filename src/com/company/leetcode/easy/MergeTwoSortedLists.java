package com.company.leetcode.easy;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode dump = result;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                dump.next = list2;
                list2 = list2.next;
            } else {
                dump.next = list1;
                list1 = list1.next;
            }
            dump = dump.next;
        }

        dump.next = list1 == null ? list2 : list1;

        return result.next;
    }

    public ListNode mergeTwoListsRecursion(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
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
        nodeA.next.next = new ListNode(4);

        ListNode nodeB = new ListNode(1);
        nodeB.next = new ListNode(3);
        nodeB.next.next = new ListNode(4);

        ListNode nodeC = new ListNode();
        ListNode nodeD = new ListNode();

        ListNode nodeE = new ListNode();
        ListNode nodeF = new ListNode(0);

        long startTime = System.nanoTime();

        System.out.println(s);
        printList(mergeTwoLists(nodeA, nodeB));
        System.out.println("Expected: [1,1,2,3,4,4]");

        System.out.println("-------------------");

        System.out.println(s);
        printList(mergeTwoLists(nodeC, nodeD));
        System.out.println("Expected: []");

        System.out.println("-------------------");

        System.out.println(s);
        printList(mergeTwoLists(nodeE, nodeF));
        System.out.println("Expected: [0]");

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
