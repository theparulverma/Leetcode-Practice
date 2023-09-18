/*class Solution {
    public int countSubstrings(String s) {
        int palinsub=0;//to count palindromic substrings
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String sub =s.substring(i,j);
                if(ispalindrome(sub)==true){
                    palinsub++;
                }
            }
        }
        return palinsub;
    }
        public boolean ispalindrome(String s){
         int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
        }
}*/
class Solution {
    public int countSubstrings(String s) {
        int palinSub = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    palinSub++;
                }
            }
        }
        return palinSub;
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}