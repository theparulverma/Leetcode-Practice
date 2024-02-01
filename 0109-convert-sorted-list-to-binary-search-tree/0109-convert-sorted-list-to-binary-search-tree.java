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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ll = convert(head);
        Integer[] arr =ll.toArray(new Integer[0]);
        return createbst(arr,0,arr.length-1);
    }
    public List<Integer> convert(ListNode head){
        List<Integer> ll = new ArrayList<>();
       // if(head==null){
         //   return null;
        //}
        while(head!=null){
            ll.add(head.val);
            head=head.next;
        }
        return ll;
    }
    
      public TreeNode createbst(Integer[] in,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid =(si+ei)/2;
        TreeNode nn = new TreeNode(in[mid]);
       // nn.val = in[mid];
        nn.left=createbst(in,si,mid-1);
        nn.right=createbst(in,mid+1,ei);
        return nn;
    }
}