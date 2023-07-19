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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode();
        ListNode display=temp;//ismein 708 reverse order mein aayega
        int carry=0;
        while (l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;//loop laga ek vallue badhane ke liye
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            int rem= sum%10;
            ListNode t=new ListNode(rem);
            display.next=t;
            display=display.next;
        }
        return temp.next;
      
        //ismein 
        /*public static void displayreverse(Node head){//display recursively
        if(head == null) return;
        displayr(head.next);//increment karega head ki value aage vale no. ke liye
        System.out.print(head.data);  //output 16 8 8 9 3 5
    }*/
    }
}