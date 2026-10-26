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
        if(head == null || head.next == null)return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)break;
        }
         if(fast == null || fast.next == null)return null;

         slow = head;
         while(slow != fast){
            slow = slow.next;
            fast = fast.next;
         }
          return slow;
        }
    }
// we return slow Because both meet at the same node — but by convention, we return slow since it’s the one reset to the head to locate the cycle’s start.