class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        find(nums,0,ll,ans);
        return ans;
    }
    public void find(int[] nums,int start,List<Integer> ll,List<List<Integer>> ans){
        //if()
        ans.add(new ArrayList<>(ll));
        for(int i = start;i<nums.length;i++){
            ll.add(nums[i]);
            find(nums,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
        
    }
}