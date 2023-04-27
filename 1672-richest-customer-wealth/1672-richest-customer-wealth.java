class Solution {
    public int maximumWealth(int[][] accounts) {
        int i; 
        int j;
        int max=Integer.MIN_VALUE;//to give minimum value of matrix agar hum 0 se initialize karke toh voh galat hoga matrix ke liye yeh function hi use karege
        for(i=0;i<accounts.length;i++){
            int sum=0;//humne yaha intialize kiya h kyuki voh garbage value ke vajah se 12 value de rahi thi.
            for(j=0;j<accounts[i].length;j++){
                sum+= accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}