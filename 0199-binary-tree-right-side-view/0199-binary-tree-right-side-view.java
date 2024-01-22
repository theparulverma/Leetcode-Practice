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
    int visited =-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();//level order linewise uska right element 
        rightside(ll,root,0);
        return ll;
    }
    /*public List<Integer> rightside(List<Integer> ll,TreeNode root){
        if(root == null){
            return null;
        }// my code
        if(root.left == null && root.right == null){
            ll.add(root.val);
        }
        rightside(ll,root.right);
        return ll;
    }*/
    public void rightside(List<Integer>ll,TreeNode root,int curr){
        //curr stands for current level aur voh level jo current mein ho voh visited level se badi honi chaiye jis se ki only right side vale add hoye 
        if(root == null){
            return;
        }
        if(curr> visited){
            ll.add(root.val);
            visited=curr;
        }
        rightside(ll,root.right,curr+1);
        rightside(ll,root.left,curr+1);
    }
}