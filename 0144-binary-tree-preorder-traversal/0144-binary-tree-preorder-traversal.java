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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ll = new ArrayList<>();
        preorder(root,ll);
        return ll;
        }
        public List<Integer> preorder(TreeNode node,List<Integer>ll){
            if(node == null){
                return new ArrayList<>();
            }
            //System.out.print(node.val + " ");
            ll.add(node.val);
            preorder(node.left,ll);
            preorder(node.right,ll);
        return ll;
    }
}