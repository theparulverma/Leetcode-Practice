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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       // List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        boolean flag = false;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> ll = new ArrayList<>();
            Stack<Integer> reverse = new Stack<>();
            for(int i =0;i<size;i++){
                TreeNode node = que.poll();
            if(flag==true){
                reverse.add(node.val);
            }
            else{
                ll.add(node.val);
            }
           
            if(node.left!= null){
                que.add(node.left);
            }
            if(node.right!=null){
                que.add(node.right);
            }
            }
            while(!reverse.isEmpty()){
                ll.add(reverse.pop());
            }
             ans.add(ll);
             flag=!flag;//means flag ko true kar diya aab alternative ke liye //means flip kar diya false hai toh true,true toh false
        }
        return ans;
    }
}