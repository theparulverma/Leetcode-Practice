class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        HashMap<Character,Integer> table = new HashMap<>();
        int j=0;
        int ans =0;
        int i=0;
        int maxrepeatcount=0;
        for(j=0;j < answerKey.length();j++){
            char ch = answerKey.charAt(j);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
            maxrepeatcount=Math.max(maxrepeatcount,table.get(ch));//means T jaise sabse jada repeat ho raha h then hum usko change nhi karne ke non repeat vale nikalege
            int nonrepeat=(j-i+1)-maxrepeatcount;
            if(nonrepeat>k){
                table.put(answerKey.charAt(i),table.get(answerKey.charAt(i))-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}