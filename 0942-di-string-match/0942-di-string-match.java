class Solution {
    public int[] diStringMatch(String s) {
        int size=s.length();
        int low =0;
        int high = size;
        int i;
        int[] output = new int[size+1];
        for( i=0;i<size;i++){
            if(s.charAt(i) == 'I'){
               output[i] = low++;
           }else{
                output[i] = high--;
            }   
        }
        output[size] = high;
        return output;
    }
}