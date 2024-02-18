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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //preorder - root left right
        //inorder left root right 
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder,int prestart,int prend,int[] inorder, int instart,int inend){
        //int startpre is start index of pre order ans same with inorder index name instrat
        if(prestart>prend || instart>inend){
            return null;
        }
        //first element of preorder is the root node of binary tree
        int rootval = preorder[prestart];
        TreeNode root = new TreeNode(rootval);
        int idx=0;//root index for finding their index of inorder
        for(int i =instart;i<=inend;i++){
            if(inorder[i]==rootval){
                idx=i;
                break;
            }
        }
        //int totalleftsubtree=idx-instart;
        root.left=build(preorder,prestart+1,prend,inorder,instart,idx-1);
        root.right=build(preorder,prestart+idx-instart+1,prend,inorder,idx+1,inend);
        return root;
    }
}