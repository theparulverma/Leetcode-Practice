class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;//no of rows 3
        int m =matrix[0].length;//no.of columns 4
        int low=0;
        int high=n*m-1;//11
        while(low<=high){
            int mid = (high+low)/2;//5
            int row=mid/m;//5/4=1
            int col = mid%m;//it means hum pehle row ke pehle column ke element ko access karne ke liye
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}