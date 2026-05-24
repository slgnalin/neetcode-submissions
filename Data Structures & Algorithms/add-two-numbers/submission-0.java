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
        ListNode head = new ListNode(-1);
        ListNode current = head;

        int carry = 0;

        ListNode left = l1;
        ListNode right = l2;

        while (left != null || right != null || carry != 0) {
            int l = left != null ? left.val : 0;
            int r = right != null ? right.val : 0;

            int currentVal = l + r + carry;

            carry = currentVal / 10;
            currentVal = currentVal % 10;

            current.next = new ListNode(currentVal);
            current = current.next;

            left = left != null ? left.next : null;
            right = right != null ? right.next : null;
        }

        return head.next;
    }
}
