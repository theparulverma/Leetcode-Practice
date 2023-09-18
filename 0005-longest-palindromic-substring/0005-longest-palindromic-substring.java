/*class Solution {
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String sub = s.substring(i,j+1);
                String hub = s.substring(j,i);
            if(sub==hub){
                return s.substring(0,i);
            }
        }
        }
        return "";
    }
}*/
class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length()>longestPalindrome.length()) {
                    longestPalindrome = sub;
                }
            }
        }

        return longestPalindrome;
    }

    private boolean isPalindrome(String str) {//to check whether the given substring is valid or not
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
