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
    public boolean isBalanced(TreeNode root) {
       return balanced(root); 
    }
    public boolean balanced(TreeNode root){
        if(root == null){
            return true;
        }
        boolean left=balanced(root.left);
        boolean right=balanced(root.right);
        boolean sb = Math.abs(height(root.left)-height(root.right))<=1;
        return left&&right&&sb;
    }
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        int left = height(root.left);
        int right= height(root.right);
        return Math.max(left,right)+1;
    }
} 