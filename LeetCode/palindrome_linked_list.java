// Palindrome Linked List [Easy]
// https://leetcode.com/problems/palindrome-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode reverse(ListNode h){
        ListNode prev = null;
        ListNode curr = h;

        while(curr!=null){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);
        ListNode first = head;
        ListNode temp = second;
        
        while(temp!=null){
            if(first.val!=temp.val){
                return false;
            }

            first = first.next;
            temp = temp.next;
        }

        return true;
    }
}