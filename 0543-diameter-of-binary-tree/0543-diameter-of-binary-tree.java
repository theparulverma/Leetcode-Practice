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
    public int diameterOfBinaryTree(TreeNode root) {
       if(root == null){
           return 0;//simple ki tree mein bass 1 node h toh height will be 0.
       } 
        int leftd = diameterOfBinaryTree(root.left);//aaise karte karte hum last node tak phochege in both left and right case
        int rightd = diameterOfBinaryTree(root.right);
        int sumd = height(root.left)+height(root.right)+2;//last root pe phoche phir usko node wise height nikalege
        return Math.max(rightd,Math.max(leftd,sumd));
    }
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        int lefth = height(root.left);
        int righth = height(root.right);
        return Math.max(lefth,righth)+1;
    }
}*/
class Solution{
    public int diameterOfBinaryTree(TreeNode root){
        return diameter(root).dt;
    }
     public diapair diameter(TreeNode root){
        if(root == null){
            return new diapair();
        }
        diapair ldp = diameter(root.left);
        diapair rdp = diameter(root.right);
        diapair sdp = new diapair();
        int sd = ldp.ht+rdp.ht+2;
        sdp.dt=Math.max(sd,Math.max(ldp.dt,rdp.dt));
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
    }
    class diapair{
        int dt=0;
        int ht=-1;

    }

}
