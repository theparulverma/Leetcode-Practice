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
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root == null){
            return ;//hum iss recursion lagaya hai pehle root se sab right pe chalegaa ya jayegaa kyuki pehle flatten root.right hi hoga uske baad jab right pe null aayega toh jab voh left pe jayegaa but hum phir root.right =prev value rakh denge aur prev hamara last right node hogaa
        }
        //right child to next node 
        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;  
    }
}