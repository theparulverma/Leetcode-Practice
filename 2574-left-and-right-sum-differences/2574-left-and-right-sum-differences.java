class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n= nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] ans = new int[n];
        int i;
        for(i = 1;i < n;i++){
            leftsum[i] = leftsum[i-1]+nums[i-1];
        }
        for(i = n-2;i >= 0;i--){
            rightsum[i] = rightsum[i+1]+nums[i+1];
        }
        for(i=0;i<n;i++){
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}