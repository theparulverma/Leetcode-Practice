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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int maxvalue =0;
        while(fast != null && fast.next != null){//for traversing the linked list
            slow = slow.next;//pointer for taking out mid of ll
            fast = fast.next.next;//this is for reaching end of the linked list
        }
        ListNode prev = null;
        ListNode nextnode;
        while(slow!= null){//for reversing the ll
            nextnode = slow.next;
            slow.next = prev;//means agar end tak phoch gayi ll 
            prev= slow;
            slow = nextnode;
            
        }
        while(prev != null){
            maxvalue = Math.max(maxvalue, prev.val + head.val);
                head=head.next;
            prev=prev.next;
        }
        return maxvalue;
    }
}