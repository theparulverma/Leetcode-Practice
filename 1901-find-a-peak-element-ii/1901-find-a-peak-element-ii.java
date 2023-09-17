class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col =mat[0].length;
        int i=0;
        int j =0;
        while(i<row && j<col){//iske jagah hum for loop bhi chala sakte the i and j ke liye but we have 4 conditions and increase accordingly that why we use while loop just for condition check
            if(i-1>=0 && mat[i-1][j]>mat[i][j]){//
                i--;
            }
            else if(j-1>=0 && mat[i][j-1]>mat[i][j]){
                j--;
            }
            else if(i+1<row && mat[i+1][j]>mat[i][j]){//yeh hum check kar rahe hai side vale element se means 4 se we are checking mat[0][0] i.e 1 ki voh bada h?
                i++;
            }
            else if(j+1<col && mat[i][j+1]>mat[i][j]){
                j++;
            }
            else{
                int ans[]={i,j};
                return ans;
            }
         
            }
         return new int[0];
        }
}
        
       /* public int[] value(int[][] mat){//convert into 1d array
            int n=mat.length;
            int m=mat[0].length;
            int k;
            int[] arr = new int[n*m];
            for(int i =0;i<n;i++){
                for(int j =0;i<mat[0].length;j++){
                    arr[k]=mat[i][j];
                    k++;
                }
            }
            return arr;
        }*/