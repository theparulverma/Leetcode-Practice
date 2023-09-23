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
    public ListNode partition(ListNode head, int x) {
       ListNode part1= new ListNode(0);
        ListNode part2= new ListNode(0);
        ListNode small=part1;
        ListNode high=part2;
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }
            else{
                high.next=head;
                high=high.next;
            }
            head=head.next;
        }
        high.next=null;
        small.next=part2.next;
        return part1.next;
    }
}