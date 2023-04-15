class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int n1 = original.length;
        if(n1 != m*n){
            return new int[][]{};
        }
         int mat[][] = new int[m][n];
            int r=0;
            int c=0;
            for(int o: original){
                mat[r][c++]=o;
                if(c==n){
                    r++;
                    c=0;
                }
            }
        return mat;
    }
}