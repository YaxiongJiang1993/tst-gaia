package com.davih.tst.alogrithm.t2025;

public class A14HasCycleTest {

    public boolean hasCycle(ListNode head) {
        boolean flag = false;
        if (null == head) {
            return flag;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p2 = p2.next.next;
            p1 = p1.next;
            if (p1 == p2) {
                flag = true;
                break;
            }
        }
        return flag;
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
