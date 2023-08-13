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
    public ListNode deleteDuplicates(ListNode head) {
        //ismein jo sirf 1 baar aayega usse list mein aayega.
         ListNode temp = new ListNode(0,head);
         ListNode prev = temp;
            while(head!=null){
                if( head.next!=null && head.val==head.next.val){
                    while(head.next!=null && head.val == head.next.val){
                     head=head.next;     
                    }
                    prev.next = head.next;
                }
                else{
                    prev=prev.next;
                }
                head= head.next;
            }
        return temp.next;
    }
}