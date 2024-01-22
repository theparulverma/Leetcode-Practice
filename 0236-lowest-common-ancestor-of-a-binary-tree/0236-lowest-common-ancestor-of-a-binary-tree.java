/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       //ancestor means uske purvaaj ,papa things condition lowest toh minimum nikala 
        return common(root,p,q);
    }
    public TreeNode common(TreeNode root,TreeNode p,TreeNode q){
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;//agar 2 nodes mein se 1 bhi root hoga toh uska lowest ancestor toh root hi hoga na
        }
        TreeNode right = common(root.right,p,q);
        TreeNode left = common(root.left,p,q);
        if(left!=null && right!=null){
            return root;
        }
        else if(right==null){
            return left;
        }
        else{
            return right;
        }
    }
}