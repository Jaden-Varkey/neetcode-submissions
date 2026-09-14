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
        if ((head.next == null) || (head.next.next == null)) return;
        ListNode sp = head;
        ListNode fp = head;
        while ((fp != null) && (fp.next != null)) {
            sp = sp.next;
            fp = fp.next.next;
        }
        ListNode prev = null;
        ListNode curr = sp.next;
        sp.next = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode ftemp = first.next;
            ListNode stemp = second.next;
            first.next = second;
            second.next = ftemp;
            first = ftemp;
            second = stemp;
        }
    }
}
