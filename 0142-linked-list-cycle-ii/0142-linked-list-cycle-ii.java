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
        /*ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast == slow) break;
        }
        ListNode temp = head;
        while(temp!=slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow;*/
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false; // Flag to check if a cycle exists

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return null; // No cycle detected, return null
        }

        // Find the starting node of the cycle
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return slow;
    }
}