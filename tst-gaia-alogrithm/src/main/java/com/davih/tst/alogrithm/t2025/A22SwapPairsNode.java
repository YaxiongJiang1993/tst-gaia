package com.davih.tst.alogrithm.t2025;

public class A22SwapPairsNode {

    public ListNode swapPairs(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode pre = h, p = h;
        ListNode p1;

        while (p.next != null && p.next.next != null) {
            p = p.next;
            p1 = p.next;
            pre.next = p1;
            p.next = p1.next;
            p1.next = p;

            pre = p;

        }

        return h.next;
    }

    public class ListNode {
        private int val;

        private ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
