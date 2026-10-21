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
    public ListNode middleNode(ListNode head) {
        ListNode fastptr = head;
        ListNode slowptr = head;

        while(fastptr != null && fastptr.next != null){//The while loop runs repeatedly until the condition fails.
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
         return slowptr;
        
    }
}//The if condition runs only once.
// It just checks one time and moves the pointers one step.