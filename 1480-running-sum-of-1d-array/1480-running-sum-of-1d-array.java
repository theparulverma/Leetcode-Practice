class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        int n=nums.length;
        int[] out = new int[n];
        for(i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
       return nums; 
    }
}