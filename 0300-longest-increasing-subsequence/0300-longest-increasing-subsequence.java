/*class Solution {
    public int lengthOfLIS(int[] nums) {
        int len=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                len++;
            }
        }
        return len;
    }
}*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);//itnitalize kardiya dp array ki saari value as 1 means

        int len = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            len = Math.max(len, dp[i]);
        }

        return len;
    }
}
