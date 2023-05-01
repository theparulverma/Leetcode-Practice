class Solution {
    public int minOperations(int[] nums) {
      int result=0;//counter variable ki kitne operations hum kar sakte h
        int temp;
        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                temp = nums[i-1] - nums[i] + 1;
                 result+= temp;
                 nums[i]+= temp;
            }
        }
        return result;
    }
}