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
      /*  if(root== null){
            return false;
        }
      int sum =find(root,k,0);
        if(sum == k){
            return true;
        }
        else return false;
    }
    public int find(TreeNode root,int k,int sum){
         if(root.val < k){
            find(root.right,k-root.val,sum+root.val);
        }
       else if(root.val > k){
          find(root.left,k-root.val,sum+root.val);            
        }
        return sum;
    }*/
class Solution {
    public boolean findTarget(TreeNode root, int k) {

        if(root == null){
            return false;
        }
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);//inorder traversal se hamara result sorted form mein hoga toh hum  uspe binary search laga sakte hai 
        //2 3 4 5 6 7 ->this is result
        int left =0;//first index hai
        int right= ans.size()-1;//last index hai
        while(left<right){
            int sum = ans.get(left)+ ans.get(right);//toh inn dono ko add karege 2+7=9
            if(sum == k){//yeh pehle hi 9 ==9 
                return true;
            }
            else if(sum<k){
                left++;
            }
            else {
                 right--;
            }

        }
        return  false;  
}
    public void inorder(TreeNode root, List<Integer> ans){
        if(root!= null){
            inorder(root.left,ans);
            ans.add(root.val);
            inorder(root.right,ans);
        }
    }
  }