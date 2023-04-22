class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] chars = s.toCharArray();
        while(start<end){
            while(start < end && !Character.isLetter(chars[start])) start++;
            while(start < end && !Character.isLetter(chars[end])) end--;
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}