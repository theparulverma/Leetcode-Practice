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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        find(root,targetSum,ll,ans);
        return ans;
    }
    public void find(TreeNode root,int targetSum,List<Integer> ll,List<List<Integer>> ans){
        //if(targetSum == 0){
          //  ans.add(new ArrayList<>(ll));
            //return;
        //}
        if(root == null){
            return;
        }
        ll.add(root.val);
        if(root.left == null && root.right == null && targetSum -root.val == 0){
           // ll.add(root.val);
            ans.add(new ArrayList<>(ll));
            
        }
         find(root.left,targetSum-root.val,new ArrayList<>(ll),ans);
        //ll.add(root.val);
         find(root.right,targetSum-root.val,new ArrayList<>(ll),ans);
       // ll.add(root.val);
        
    }
    
}