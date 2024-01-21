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
    public boolean isSymmetric(TreeNode root) {
     return symmetric(root.left,root.right);  
    }
    public boolean symmetric(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){//it means agar left aur right subtree mein kuch hoga hi nhi toh obviously true hoga
            return true;
        }
        if(root1 == null || root2 == null){//umein se agar sirf 1 null hai toh return false karega
            return false;
        }
        if(root1.val != root2.val){
            return false;//if values are not same
        }
        boolean f1 = symmetric(root1.left,root2.right);//recursive call lagaya h ek baar root1 ka left root2 ka right and dursa vice versa
        boolean f2 = symmetric(root1.right,root2.left);
        return f1&&f2;
    }
}