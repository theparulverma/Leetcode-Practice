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
     //it means uss tree ka 3rd smallest element example iss tree mein 4 nodes hai and value as 1,2,3,4 toh ismein 1st smallest element 1 hi hoga// toh inorder lagayega kyuki bilkul sorted hoga voh sequence mein
class Solution {
    int count =0;
    int out =0;
    public int kthSmallest(TreeNode root, int k) {
        //int count =0;
        if(root == null){
            return 0;
        }
        find(root,k);
        return out;
    }
    public void find(TreeNode root,int k){
    if(root.left!=null){
         find(root.left,k);//it means pehle hum inorder lagayege saare left traverse kiya
    }  
        count++;
        if(count==k){
            out=root.val;
            return;
        }
        if(root.right!=null){
         find(root.right,k);
        }
    }
}