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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        return traverse(root,ll);
    }
    public List<Integer> traverse(TreeNode root,List<Integer> ll){
        if(root == null){
            return new ArrayList<>();
        }
    traverse(root.left,ll);
    traverse(root.right,ll);
    ll.add(root.val);
    return ll;
    }
}