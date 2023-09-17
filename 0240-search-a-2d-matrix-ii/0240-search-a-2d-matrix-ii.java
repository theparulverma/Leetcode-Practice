class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      /*while(low<=high){
          int mid=(high+low)/2;//bs will not apply here kyuki voh 1d array will not be in sorted form
          if(arr[mid]==target){
              return true;
          }
          else if(arr[mid]>target){
              
          }
      }*/
        int[] arr =convert(matrix);
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static int[] convert(int[][] matrix){
        int Rows = matrix.length;
    int Cols = matrix[0].length;
    
    int[] arr1D = new int[Rows * Cols];
    
    int index = 0; // Index for the 1D array
    
    for (int i = 0; i < Rows; i++) {
        for (int j = 0; j < Cols; j++) {
            arr1D[index] = matrix[i][j];
            index++;
        }
    }
    
    return arr1D;
    }
}

/*class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = (n*m)-1;
        while(low<=high){
           int mid=low+(high-low)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high =mid-1;
            }
        }
        return false;
    }
}*/