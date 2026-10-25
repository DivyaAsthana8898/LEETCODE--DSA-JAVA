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
    public ListNode rotateRight(ListNode head, int k) {

        // Step 1: Empty list ya k = 0
        if (head == null || k == 0) {
            return head;
        }

        // List ki length count karo
        int len = 1;
        ListNode temp = head;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: List ko circular banao
        temp.next = head;

        // Extra rotations remove karo
        k = k % len;

        // Step 3: New last node tak jao
        temp = head;

        for (int i = 1; i < len - k; i++) {
            temp = temp.next;
        }

        // Step 4: New head set karo
        ListNode forward = temp.next;

        // Step 5: Circular link break karo
        temp.next = null;

        // Step 6: New head return karo
        return forward;
    }
}
        
    
