class Solution {
    public int characterReplacement(String s, int k) {
        int maxrepeatcount =0;
        int i=0;
        int j=0;
        int ans =0;//length of longest repeating character
        HashMap<Character,Integer> table= new HashMap<>();
        for(j=0;j<s.length();j++){
            char curr = s.charAt(j);
            table.put(curr,table.getOrDefault(curr,0)+1);
            maxrepeatcount=Math.max(maxrepeatcount,table.get(curr));//means  A jaise sabse jada repeat ho raha h then hum usko change nhi karne ke non repeat vale nikalege
            int nonrepeat=(j-i+1)-maxrepeatcount;
            if(nonrepeat>k){
                table.put(s.charAt(i),table.get(s.charAt(i))-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}