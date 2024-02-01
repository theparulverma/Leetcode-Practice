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
    int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
       if(preorder==null||preorder.length==0){
           return null;
       }
        return construct(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public TreeNode construct(int[] preorder,int min,int max){
        if(idx==preorder.length){
            return null;
        }
        TreeNode root = null;
        int key=preorder[idx];
        if(key<max && key>min){
            root = new TreeNode(preorder[idx]);
            idx++;
            root.left=construct(preorder,min,key);
            root.right=construct(preorder,key,max);
        }
        return root;
    }
}