class Solution {
    public int waysToSplitArray(int[] nums) {
         long sum = 0;
        long csum = 0;
        int valid = 0;
        
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            csum += nums[i];
            if (csum >= sum - csum) {
                valid++;
            }
        }
        
        return valid;
    }
}