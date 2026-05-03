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
    public void reorderList(ListNode head) {
        ListNode left = head, right = head, temp = head;
        while (right.next != null) {
            right = right.next;
        }
        while (left != right){
            temp = left.next;
            left.next = right;
            right.next = temp;

            left = temp;
            while (temp != null && temp.next != right){
                temp = temp.next;
            }
            right = temp;
        }
        right.next = null;
    }
}
