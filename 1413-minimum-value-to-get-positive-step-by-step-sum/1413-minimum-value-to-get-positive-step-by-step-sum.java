class Solution {
   /* public int minStartValue(int[] nums) {
        int  startvalue=5;
        int i;
        for(i=0;i<nums.length;i++)
        {
            startvalue=startvalue+nums[i];
        }
        System.out.println(nums[i]);
    }
    return startvalue;*/
    public int minStartValue(int[] nums){
        int min=0;
        int prefix=0;
        for(int el:nums){
            prefix += el;
            min=Math.min(min,prefix);
        }
        return min <0 ? Math.abs(min) + 1 : 1;
    }
}