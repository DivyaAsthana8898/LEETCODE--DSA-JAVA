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
    public boolean isPalindrome(ListNode head) {
        // code of middle node
        if(head == null || head.next == null){
            return true;
        }

            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
        
        // code for reversal
        ListNode current = slow;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
             next = current.next;
             current.next  = previous;
             previous    = current;
             current = next;

        }// MAIN LOGIC OF COMPARISION
        ListNode  temp1 = head;
        ListNode  temp2 = previous;
           while(temp1 != null && temp2 != null){
               if(temp1.val != temp2.val){
                return false;
               }else{
                temp1 = temp1.next;
                temp2 = temp2.next;

               }
           }
           return true;
    }
}