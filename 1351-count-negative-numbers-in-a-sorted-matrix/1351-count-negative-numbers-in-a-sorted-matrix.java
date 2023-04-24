class Solution {
    public int countNegatives(int[][] grid) {
        int i;
        int j;
        int res=0;//counter variable to count negative no.
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    res++;
                }
            }
        }
        return res;
    }
}