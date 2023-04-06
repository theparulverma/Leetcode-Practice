class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i;
        int c=0;
        int max = 0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c++;
                max = Math.max(max,c);
            }else {
            c=0;
        }
        } 
        return max;
    }
}