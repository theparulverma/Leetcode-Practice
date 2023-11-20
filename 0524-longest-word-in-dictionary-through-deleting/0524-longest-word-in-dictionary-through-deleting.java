/*class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result =" ";
        for(String word:dictionary){
            if(isSubsequence(s,word)){
                if(word.length() >result.length() || (word.length()==result.length() && word.compareTo(result)<1)){//yeh compare function lexicographical order ke liye h
                    result=word;
                }
            }
        }
        return result;  
    }
    private boolean isSubsequence(String s,String word){
        int i =0;
        int j =0;
        while(i<s.length() && j<word.length()){
            if(s.charAt(i)==word.charAt(j)){
                j++;
            }
            i++;
        }
        return j == word.length();
    }
}*/
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String result = "";
        
        for(String str : d) {
            if(isSubsequence(s, str) ) {
                //Length str > result || length is equal but str is lexicographically small. 
                if(str.length() > result.length() || (str.length() == result.length() && str.compareTo(result) < 1))
                result = str;
            }
        }
        return result;
    }
    
    public boolean isSubsequence(String S, String D) {
        int i = 0, j = 0;
        if(D.length() > S.length()) return false;
        while(i < S.length() && j < D.length()) {
            if(S.charAt(i) == D.charAt(j)) j++;
            i++;
        }
        return j == D.length();
    }
}