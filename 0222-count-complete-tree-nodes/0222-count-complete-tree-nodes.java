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
    public int countNodes(TreeNode root) {
     int count=0;
     return preorder(root);
    }
    public int preorder(TreeNode root){
        int count =0;
        if(root == null){
            return 0;
        }
        count += preorder(root.left);
        count += preorder(root.right);
        count++;
        return count;
    }
}