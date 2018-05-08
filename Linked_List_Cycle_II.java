/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null) {
            if(fast == slow) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != slow) {
            return null;
        } else {
            while(head != slow.next) {
                head = head.next;
                slow = slow.next;
            }
            return head;
        }
    }
}