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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        int s = l1.val + l2.val;
        if (s < 10) {
            return new ListNode(s, addTwoNumbers(l1.next, l2.next));
        }

        return new ListNode(s % 10, addTwoNumbers(
            addTwoNumbers(l1.next, l2.next),
            new ListNode(1)));
    }
}
