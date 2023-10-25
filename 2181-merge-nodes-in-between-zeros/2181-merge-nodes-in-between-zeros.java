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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode result = new ListNode();
        ListNode resulthead= result;
        while(head !=null){
            if(head.val==0 && sum!=0){
                ListNode newone= new ListNode(sum);
                result.next = newone;
                result= result.next;
                sum=0;
            }else{
                sum += head.val;
            }
            head= head.next;
        }
        return resulthead.next;
    }
}