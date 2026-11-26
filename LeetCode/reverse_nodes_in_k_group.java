// Reverse Nodes in k-Group [Hard]
// https://leetcode.com/problems/reverse-nodes-in-k-group/

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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
       
        int count = 0;
        while(curr!=null && count<k){
            count++;
            curr=curr.next;
        }

        if(count<k){
            return head;
        }
        int i= 0;
         ListNode prev = null;
          ListNode current = head;
        while(current!=null && i<k){
                     ListNode next = current.next;
                     current.next = prev;
                     prev = current;
                     current= next;
                     i++;
        }

        head.next = reverseKGroup(current,k);

        return prev;
    }
}