class Solution {
    public int longestPalindromeSubseq(String s) {
        //dp se karege toh jo hamari string h usko reverse karege then unn dono ko compare karke longest subsequence dekhege palindrome
        //
        /*for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String sub =s.substring(i,j);
                
            }
        }
    }
        public boolean(String str){
            int left=0;
            int right=str.length();
            while(left<=right){
                if(str.charAt(left)!=str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;*/
        String text1=s;
        String text2=new StringBuilder(s).reverse().toString();//yeh puri string ko reverse kar degaa.without any loop or brute force
        int[][]dp=new int[text1.length()+1][text2.length()+1];
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(text1.charAt(i-1)==text2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        return dp[text1.length()][text2.length()];
        }
}