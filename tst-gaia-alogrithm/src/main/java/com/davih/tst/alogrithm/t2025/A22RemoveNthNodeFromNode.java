package com.davih.tst.alogrithm.t2025;

/**
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/?envType=study-plan-v2&envId=top-100-liked
 */
public class A22RemoveNthNodeFromNode {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p = head, p1 = head;
        int count = -1;
        while (p != null) {
            p = p.next;
            if (count != n) {
                count++;
            } else {
                p1 = p1.next;
            }
        }
        if (count + 1 == n) {
            head = head.next;
            p1.next = null;
        } else {
            ListNode t = p1.next;
            p1.next = p1.next.next;
            t.next = null;
        }

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
