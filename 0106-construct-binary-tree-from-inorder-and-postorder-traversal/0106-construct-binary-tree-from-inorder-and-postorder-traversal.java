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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode build(int[] inorder,int instart,int inend,int[] postorder,int poststart,int postend){
        if(poststart> postend || instart>inend){
            return null;
        }
        int rootval=postorder[postorder.length-1];
        TreeNode root = new TreeNode(rootval);
        int idx=0;
        for(int i =instart;i<=inend;i++){
            if(inorder[i]==rootval){
                idx=i;
                break;
            }
        }
        root.right=build(inorder,idx+1,inend,postorder,poststart+idx-instart,postend-1);
        root.left=build(inorder,instart,idx-1,postorder,poststart,poststart + idx - instart - 1);
        return root;
    }
}*/

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || postorder.length!=inorder.length){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<inorder.length;++i){
            map.put(inorder[i],i);
        }
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1,map);
    }

    public TreeNode build(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend,HashMap<Integer,Integer> map) {
        if (poststart > postend || instart > inend) {
            return null;
        }

        int rootval = postorder[postend];
        TreeNode root = new TreeNode(rootval);
        int inroot = map.get(postorder[postend]);
        int numsleft=inroot-instart;
        root.left=build(inorder,instart,inroot-1,postorder,poststart,poststart+numsleft-1,map);
        root.right=build(inorder,inroot+1,inend,postorder,poststart+numsleft,postend-1,map);

        return root;
    }
}
