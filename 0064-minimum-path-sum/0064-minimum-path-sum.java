class Solution {
    public int minPathSum(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int[][] dp= new int[rows][cols];
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(i==rows-1 && j!=cols-1){//means top right ka element h and row ka last element but col ka nhii
                    dp[i][j]=grid[i][j]+dp[i][j+1];
                }else if(j==cols-1 && i!=rows-1){//means last ke row ka last element
                    dp[i][j]=grid[i][j]+dp[i+1][j];
                }else if(i!=rows-1 && j!=cols-1){//means matrix ka koii middle ka element
                    dp[i][j]=grid[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                }else{
                    dp[i][j]=grid[i][j];
                }   
            }
        }
        return dp[0][0];
    }
}