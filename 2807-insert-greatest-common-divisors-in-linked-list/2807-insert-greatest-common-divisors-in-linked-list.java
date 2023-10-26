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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode temp =head;
        while(temp.next!= null){
            int a = temp.val;
            int b = temp.next.val;
            int c = gcd(a,b);
            ListNode  newnode = new ListNode(c);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = temp.next.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    }
