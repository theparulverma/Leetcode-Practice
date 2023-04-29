class Solution {
    public boolean checkValid(int[][] matrix) {
        int n= matrix.length;
        for(int i=0;i<n;i++){
            boolean rvis[] = new boolean[n+1];// row wise yeh ismein ek time ki boolean value rowise
            boolean cvis[] = new boolean[n+1];// column wise
            for(int j = 0;j<n;j++){
                int r=matrix[i][j];//ismein r ki value jaise 3 tak value tohn 1,2,3 elements aa sakte hai isliye loop ke ander liya hai
                int c=matrix[j][i];
                if(rvis[r]==true || cvis[c]==true){//bass yeh check karege ki repeat toh nhi ho rahi koi value kyuki humne values different chaiye chahe kisi bhi order mein ho
                    return false;
                }
              rvis[r]=true;
              cvis[c]=true;
            }
        }
        return true;
    }
}