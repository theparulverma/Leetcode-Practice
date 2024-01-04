class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums,ll,ans);
        return ans;
    }
    public static void permutation(int[] board,List<Integer> ll,List<List<Integer>> ans){
        if(ll.size()==board.length){
            ans.add(new ArrayList<Integer>(ll));
            return;
        }
        for(int i = 0 ;i<board.length;i++){
            if(!ll.contains(board[i])){
            ll.add(board[i]);
            permutation(board,ll,ans);
            ll.remove(ll.size()-1);
            }
        }
    }
}
