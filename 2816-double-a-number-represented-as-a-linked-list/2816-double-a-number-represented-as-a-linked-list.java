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
    public ListNode doubleIt(ListNode head) {
        if (head.val >= 5) {
            head = new ListNode(0, head);
        }

        ListNode current = head;

        while (current != null) {
            current.val = (current.val * 2) % 10;

            if (current.next != null && current.next.val >= 5) {
                current.val++;
            }

            current = current.next;
        }

        return head;
    }
}