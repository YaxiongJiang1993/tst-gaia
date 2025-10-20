package com.davih.tst.alogrithm.t2025;

public class IntersectionNodeTest09 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = p1 != null ? p1.next : headB;
            p2 = p2 != null ? p2.next : headA;
        }

        return p1;
    }

    public class ListNode {
        private int val;

        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
