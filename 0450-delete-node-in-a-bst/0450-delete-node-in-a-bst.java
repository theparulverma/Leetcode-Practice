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
    public TreeNode deleteNode(TreeNode root, int key) {
        //first we have to find or search that node after that we have to delete node and maintain as bst
         return delete(root,key);
    }
    public TreeNode delete(TreeNode root,int key){
        if(root==null){
            return null;
        }
         if(root.val<key){
            root.right=delete(root.right,key);   
        }
        else if(root.val>key){
            root.left=delete(root.left,key);
        }
        else{
            //one child or 0 child
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            else{
                int max = max(root.left);//maximum value nikale left subtree mein se phir usko delete kardege
                root.left=delete(root.left,max);
                root.val=max;
            }
        }
        return root;
    }
    public int max(TreeNode node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int val=max(node.right);
        return Math.max(node.val,val);
    }
}