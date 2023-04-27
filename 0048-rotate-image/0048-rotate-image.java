class Solution {
    public void rotate(int[][] matrix) {
        int i;
        int j;
        int temp=0;
        int n=matrix.length;
        for(i=0;i<n/2;i++){
            // for(j=0;j<n/2;j++){
               int[] temp1 =matrix[i];//rotation
                matrix[i]=matrix[n-i-1];
                matrix[n-i-1]=temp1;
            // }
        }
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];//transpose
                matrix[j][i]=temp;
            }
        }
    }
}