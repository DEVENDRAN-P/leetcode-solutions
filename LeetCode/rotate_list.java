// Rotate List [Medium]
// https://leetcode.com/problems/rotate-list/

class Solution {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        k = k % count;

        if (k == 0) {
            return head;
        }

        head = reverse(head);

        ListNode curr = head;
        ListNode prev = null;
        int i = 0;

        while (curr != null && i < k) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;

            i++;
        }

        head = prev;

        ListNode rem = reverse(curr);

        ListNode connector = head;

        while (connector.next != null) {
            connector = connector.next;
        }

        connector.next = rem;

        return head;
    }

    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}