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
/*class Solution {
    public boolean isBalanced(TreeNode root) {
       return balanced(root); 
    }
    public boolean balanced(TreeNode root){
        if(root == null){
            return true;
        }
        boolean left=balanced(root.left);
        boolean right=balanced(root.right);
        boolean sb = Math.abs(height(root.left)-height(root.right))<=1;//it means jo rooot node h 2 children ka uska check karege if it is balanced or not by calculating the difference such that it comes 1,-1,0
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
} */
class Solution{
    public boolean isBalanced(TreeNode root){
        return calculate(root).balance;
    }
    public balancedpair calculate(TreeNode root){
        if(root == null){
            return new balancedpair();
        }
        balancedpair lbp=calculate(root.left);//left balanced pair
        balancedpair rbp=calculate(root.right);//right balanced pair
        balancedpair sbp=new balancedpair();//self balanced pair
        sbp.ht = Math.max(lbp.ht,rbp.ht)+1;
        boolean sb =Math.abs(lbp.ht-rbp.ht)<=1;
        sbp.balance=lbp.balance && rbp.balance && sb;
        return sbp;
        
       // return sbp;
    }
    class balancedpair{
        int ht=-1;
        boolean balance=true;
    }
}