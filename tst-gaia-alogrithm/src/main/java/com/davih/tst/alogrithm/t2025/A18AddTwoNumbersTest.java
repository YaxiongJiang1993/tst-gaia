package com.davih.tst.alogrithm.t2025;

public class A18AddTwoNumbersTest {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int high = 0;
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            int num = l1.val + l2.val + high;
            high = num / 10;
            num = num % 10;
            l1.val = num;
            p.next = l1;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode l = l1 == null ? l2 : l1;
        if (l == null) {
            if (high == 1) {
                p.next = new ListNode(1);
            }
        } else {
            ListNode lp = l;
            ListNode pre = l;
            while (lp != null && high == 1) {
                int num = lp.val + high;
                high = num / 10;
                num = num % 10;
                lp.val = num;
                pre=lp;
                lp = lp.next;
            }
            if (high == 1) {
                pre.next = new ListNode(1);
            }

            p.next = l;
        }

        return head.next;

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
