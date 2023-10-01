class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer> check= new HashMap<>();
        int start=0;
        int end=0;
        int n=s.length();
        int len=0;//means length of string which is longest 
        while(end<n){
            char current = s.charAt(end);
            if(check.containsKey(current)){
                start=Math.max(check.get(current)+1,start);
            }
            check.put(s.charAt(end),end);
            len=Math.max(len,end-start+1);
                end++;
        }
        return len;
    }
}