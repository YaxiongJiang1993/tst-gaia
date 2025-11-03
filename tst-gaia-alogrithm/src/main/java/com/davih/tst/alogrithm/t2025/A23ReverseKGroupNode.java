package com.davih.tst.alogrithm.t2025;

public class A23ReverseKGroupNode {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode h = new ListNode(-1);
        h.next = head;

        ListNode p1 = h, p = h;
        int count = 0;
        while (p.next != null) {
            p = p.next;
            count++;
            if (count == k) {
                count = 0;
                p = reverse(p1, k);
                p1 = p;
            }
        }

        return h.next;
    }

    public ListNode reverse(ListNode head, int k) {
        ListNode p = head.next;
        ListNode p2 = p;
        head.next = null;
        int count = 0;
        while (p != null) {
            ListNode t = p.next;
            p.next = head.next;
            head.next = p;
            p = t;
            count++;
            if (count == k) {
                break;
            }
        }

        p2.next = p;

        return p2;

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
