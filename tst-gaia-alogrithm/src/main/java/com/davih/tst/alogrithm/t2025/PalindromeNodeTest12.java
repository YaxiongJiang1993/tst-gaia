package com.davih.tst.alogrithm.t2025;

public class PalindromeNodeTest12 {

    public boolean isPalindrome(ListNode head) {
        if (null == head) {
            return true;
        }
        ListNode endOfHalf = endOfFirstHalf(head);
        ListNode secondFirst = reverseNodeList(endOfHalf.next);
        boolean res = true;
        ListNode p1 = head;
        ListNode p2 = secondFirst;
        while (res && p2 != null) {
            if (p1.val != p2.val) {
                res = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        reverseNodeList(endOfHalf.next);

        return res;
    }


    public ListNode reverseNodeList(ListNode head) {

        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        return pre;
    }

    public ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
