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
    public ListNode mergeNodes(ListNode head) {
        ListNode read = head.next;
        ListNode write = head;

        while(read != null){
            int sum = 0;
            while(read.val != 0){
                sum = sum + read.val;
                read = read.next;   
            }
             // pouring the sum val into write
            write.val = sum;
            // del prev nodes

            write.next = read.next;
         // moving ptrs 1step
            read = read.next;
            write = write.next;

        }
        return head;
    }
}