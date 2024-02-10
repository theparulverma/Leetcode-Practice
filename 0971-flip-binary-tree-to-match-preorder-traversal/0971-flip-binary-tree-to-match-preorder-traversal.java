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
 /*if(voyage.length<=2){
            return new ArrayList<>(Collections.nCopies(1,-1));
        }
        ArrayList<Integer> ll = new ArrayList<>();
        //flip(ll,root,voyage);
    //public void flip(ArrayList<Integer> ll,TreeNode root,int[] voyage){
        if(voyage.length == 3){
            if(root.left.val==voyage[2] && root.right.val==voyage[3]){
                return new ArrayList<>();
            }
        }
        return ll;*/
class Solution {
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
       
        ArrayList<Integer> ll = new ArrayList<>();
        if(root == null){
            return ll;
        }
        Stack<TreeNode> st = new Stack<>();
        st.add(root);
        int i = 0;
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            if(node.val != voyage[i++]){
                return Arrays.asList(-1);
            }
            if(node.right != null && node.right.val == voyage[i]){
                if(node.left != null){
                    ll.add(node.val);
                    st.add(node.left);
                }
                st.add(node.right);
            }
            else{
                if(node.right != null)
                    st.add(node.right);
                if(node.left != null)
                    st.add(node.left);
            }
        }
        return ll;
    }
}
