class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);//array ko sort kar liya jis se ki duplicates handle karle
        power(nums,0,ll,ans);
        return ans;
    }
    public void power(int[] nums,int idx,List<Integer> ll,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));
        //if()
        for(int i = idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;//skip the duplicates elements
            }
            ll.add(nums[i]);
            power(nums,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}
