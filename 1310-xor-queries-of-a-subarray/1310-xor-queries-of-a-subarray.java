class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int xor =0;
        int n = arr.length;
        int prefixXor[]= new int[n];
         prefixXor[0]= arr[0];
        int out[] = new int[queries.length];
        for(int i =1;i<arr.length;i++){
         prefixXor[i]= prefixXor[i-1]^arr[i];//humne ek array banaya jismein xor ki values rakehe 0 se end index tak ki assume 1 ki 1 hogi xor value 3 ki 1^3 hogi ,4 ki 1^3^4 hogi soo prefix nikal liya xor and put in array [ 1,3,4,8] 
        }
        for(int i =0;i<queries.length;i++){
            int l = queries[i][0];//noow for calculating the range of xor values jab l= 0 hogi toh koi problem nhi as l means low ya pehle vala index soo 0 se 1 xor we have calculated in prefixXor aray
            int r = queries[i][1]; 
              if(l==0){
                  out[i]=prefixXor[r];
              }
            else{
                out[i]=prefixXor[r]^prefixXor[l-1];// problem is whenn we have starting range given soo just prefixxor r tak then xor with prefixxor l-1 se
            }
        }
        return out;
    }
}