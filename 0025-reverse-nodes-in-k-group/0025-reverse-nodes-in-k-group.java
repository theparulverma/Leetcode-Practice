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
    public ListNode reverseKGroup(ListNode head, int k) {
     //ek dummy node lenge hum aur ek temp variable    
        int count=0;//uss node tak count karne ke liye jaha tak k ki value hai jis se vaha se reverse kar paye
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next!=null){
            temp=temp.next;
            count++;//loop for jaha se reverse karni h value
        }
        temp=dummy;
        while(temp.next!=null){//means last node null nhi honi chaiye means end of the linked list
            if(count<k)break;
            int nodes =k-1;
            ListNode tempnext=temp.next;
            ListNode first =temp.next;
            ListNode second=first.next;
            while(nodes-- > 0){
                ListNode next =second.next;
                second.next=first;
                first=second;
                second=next;
            }
            count-=k;
            temp.next=first;
            tempnext.next=second;
            temp=tempnext;
        }
       return dummy.next; 
    }
}