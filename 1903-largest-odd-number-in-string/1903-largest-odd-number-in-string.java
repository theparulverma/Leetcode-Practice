class Solution {
    public String largestOddNumber(String num) {
        String l =" ";
        for(int i =num.length()-1;i>=0;i--){//back se chalegayege loop kyyuki 2 check karege
            int k=num.charAt(i);
            if(k%2!=0){
                return num.substring(0,i+1);//substring means 0 se 1 ke beech  mwin joki sirf 5 hoga
        }
        }
        return "";
    }
}