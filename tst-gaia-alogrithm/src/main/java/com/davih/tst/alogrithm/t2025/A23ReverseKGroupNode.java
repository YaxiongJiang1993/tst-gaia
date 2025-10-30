package com.davih.tst.alogrithm.t2025;

public class A23ReverseKGroupNode {

    public ListNode reverseKGroup(ListNode head, int k){

        return head;
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
