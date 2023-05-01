class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
     int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==1){//odd 
                count++;
            }
            else{
                count=0;//yeh condition consecutive ke liye ki agar na ho toh dubara 0 ho jaye
            }
            if(count==3){//3 consecutive hainaa toh isliye count  3 
                return true;
            }
        }
        return false;
    }
}