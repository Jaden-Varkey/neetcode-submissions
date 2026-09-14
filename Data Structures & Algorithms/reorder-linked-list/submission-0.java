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
        ListNode curr = head;
        ArrayList<ListNode> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        curr = head;
        for (int i = 1, j = list.size() - 1; i <= j; i++, j--) {
            curr.next = list.get(j);
            curr = curr.next;
            if (i == j) {
                break;
            }
            curr.next = list.get(i);
            curr = curr.next;
        }
        curr.next = null;
    }
}
