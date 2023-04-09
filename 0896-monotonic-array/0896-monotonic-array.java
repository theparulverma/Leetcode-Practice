class Solution {
    public boolean isMonotonic(int[] nums) {
        int i;
        boolean increase= true;
        boolean decrease= true;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                decrease=false;
            }
            if(nums[i]>nums[i+1])
            {
                increase =false;
            }
        }
        return increase||decrease;
    }
}