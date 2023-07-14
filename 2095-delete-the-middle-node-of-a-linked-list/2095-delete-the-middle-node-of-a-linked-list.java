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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){//single element h list mein
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //1 2 3 4 5
        //delete karna h 3 ko ,,so 2 ko attach karna h 4 se,,3->slow.next,4->slow.next.next
        slow.next=slow.next.next;
        return head;
    }
}