// Linked List Cycle II [Medium]
// https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while( fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode ent = head;

                while(ent!=slow){
                    ent = ent.next;
                    slow = slow.next;

                }

                return ent;
            }
        }
    return null;
    }
}