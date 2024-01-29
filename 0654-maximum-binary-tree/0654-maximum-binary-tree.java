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


/*int large=nums[0];
        for(int i =0;i<nums.length;i++){
            if(large<nums[i]){
                large=nums[i];
            }
        }
        TreeNode root= new TreeNode();
         root.val = large;
        inorder(root,nums);
        return root;
    }
    public void inorder(TreeNode root,int[] nums){
        if(root==null){
            return;
        }
       root.left= inorder(root.left,nums);
        root.val=val;
        root.right= inorder(root.right,nums);*/
        // they are first founding the greatest value as 6 ok as main root aab 6 ke baad jo left hai aur right hai usmein se max choose karege jo 

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root= bt(nums,0,nums.length-1);//bt means binary tree
        return root;
    }
    public TreeNode bt(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        if(start==end){
            return new TreeNode(nums[start]);
        }
        
        int idx = max(nums,start,end);
        TreeNode root = new TreeNode(nums[idx]);
        root.left=bt(nums,start,idx-1);
        root.right=bt(nums,idx+1,end);
        return root;
    }
    public int max(int[] nums,int start,int end){
        int large=nums[start];
        int idx=start;
        for(int i =start;i<=end;i++){
            if(large<nums[i]){
                large=nums[i];
                idx=i;
            }
        }  
        return idx;
    }
    
}