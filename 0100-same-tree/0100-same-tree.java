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
    public boolean isSameTree(TreeNode p, TreeNode q) {
         if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return same(p, q);
     //   return same(p.left,q.left);
    }
    public boolean same(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        boolean f1 = same(root1.left,root2.left);
        boolean f2 = same(root1.right,root2.right);
        return f1&&f2;
    }
}