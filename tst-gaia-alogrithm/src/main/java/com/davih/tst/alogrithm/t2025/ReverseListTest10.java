package com.davih.tst.alogrithm.t2025;

public class ReverseListTest10 {

    /**
     * 无头节点
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode h2 = new ListNode();
        ListNode p = null;
        while (head != null) {
            p = head;
            head = head.next;
            p.next = h2.next;
            h2.next = p;
        }
        return h2.next;
    }

    /**
     * 有头节点
     *
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode h2 = head;
        ListNode p = null;
        head = head.next;
        while (head != null) {
            p = head;
            head = head.next;
            p.next = h2.next;
            h2.next = p;
        }
        return h2;
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
