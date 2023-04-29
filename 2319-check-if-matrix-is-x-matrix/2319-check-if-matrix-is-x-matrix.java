class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j == n-1){ //diagnaol elements ke liye aur corner elements
                    if(grid[i][j]==0){
                        return false;
                    }
                }else{
                    if(grid[i][j]!=0){//aur jo elements baache hai diagonal elemnts ko chod kar voh check karege ki voh agar nhi hue zero toh false
                        return false;
                    }
                }
            }
        }
        return true;
    }
}