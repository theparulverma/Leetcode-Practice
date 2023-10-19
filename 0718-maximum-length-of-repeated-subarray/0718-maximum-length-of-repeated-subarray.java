class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        //largest common subarray
        //dynamic programming se hoga kyuki dp name ke 2d array banega n1 aur n2 jab match hoga toh 1 kar denge uss position pe condition likhege 1+dp[i-1][j-1];karege means voh length count ya increase hoti rahegii na
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m+1][n+1];
        int ans =0;
        for(int i =1;i<= m ;i++){
            for(int j =1;j<=n; j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j]= 1 + dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }
            }
        }
        return ans;
    }
}