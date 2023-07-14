/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;//it means hume 5 node hatana hai toh uss node mein 1 ki value ya data aa gaya
        node.next=node.next.next;//aur node.next means 1 node aur 9 node vala bacha sirf
        
    }
}