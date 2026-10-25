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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;

        ListNode largeHead = new ListNode(-1);
        ListNode largeTail = largeHead;

        ListNode temp = head;

        while (temp != null) {
            ListNode nodeToInsert = temp;
            temp = temp.next;
            nodeToInsert.next = null;

            if (nodeToInsert.val < x) {
                smallTail.next = nodeToInsert;
                smallTail = nodeToInsert;
            } else {
                largeTail.next = nodeToInsert;
                largeTail = nodeToInsert;
            }
        }

        smallTail.next = largeHead.next;

        return smallHead.next;
    }
}