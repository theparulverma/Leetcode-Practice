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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;//yeh vala variable pura linked list padhne ke liye 1 se lekar 5 tak
        ListNode slow = start;//means jis se jo element h usse delete karke next next karke
        for(int i = 1;i <= n; ++i){
            fast=fast.next;
        }
        while(fast.next != null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
        return start.next;
    }
}