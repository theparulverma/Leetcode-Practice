class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){//agar length hi same nhi hue toh kaise anagram possible h
            return false;
        }
        int[] arr = new int[26];//26 isliye liya h there are 26 aplhabets
        for(int i=0;i<n;i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int j =0;j<m;j++){
            arr[t.charAt(j) - 'a']--;//agar s mein ab hai aur t mein ac toh -1 ho jayegi value means smaller than zero.
            if(arr[t.charAt(j) - 'a'] <0){
                return false;
            }
        }
        return true;    
    }
}