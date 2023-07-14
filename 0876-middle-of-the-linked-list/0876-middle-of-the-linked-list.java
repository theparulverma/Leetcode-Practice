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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;//slow middle nikalega linked list ke
        ListNode fast = head;//fast end tak jayegaa jis se humne pata chal sake kab khztam hui
        while(fast!=null && fast.next!=null){//it means fast pehle emd tak jayegaa linked list ki toh usko check karege ki linked list khatam ho gayi ya aabhi bhi baachi h
            slow=slow.next;
            fast=fast.next.next;
    }
    return slow;
}
}