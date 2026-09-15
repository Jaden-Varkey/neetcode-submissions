/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> visited = new ArrayList<>();
        while ((headA != null) || (headB != null)) {
            if (headA != null) {
                if (visited.contains(headA)) {
                    return headA;
                }
                visited.add(headA);
                headA = headA.next;
            }
            if (headB != null) {
                if (visited.contains(headB)) {
                    return headB;
                }
                visited.add(headB);
                headB = headB.next;
            }
        }
        return null;
    }
}