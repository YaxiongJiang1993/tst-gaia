package com.davih.tst.alogrithm.t2025;

public class A15HasCycleIITest {


    public ListNode detectCycle(ListNode head) {

        if (null == head) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return null;
        }

        ListNode p = head;
        while (p != slow) {
            p = p.next;
            slow = slow.next;
        }

        return p;
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
