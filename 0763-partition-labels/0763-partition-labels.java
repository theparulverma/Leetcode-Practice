class Solution {
    public List<Integer> partitionLabels(String s) {
      List<Integer> out = new ArrayList<>();
        HashMap<Character,Integer> lastoccur = new HashMap<>();
        for(int i =0;i<s.length();i++){
            lastoccur.put(s.charAt(i),i);
        }
        int start=0;
        int end =0;
       for(int i =0;i<s.length();i++){
           char ch = s.charAt(i);
           int index = lastoccur.get(ch);//yeh store karva raha hai lastoccur ka index means agar 'a' word last occur hua hai 9 index pe aayega .
           
           end = Math.max(end,index);
           if(i==end){
               out.add(end-start+1);
               start=end+1;//it means jo humara next partition hoga voh hamare pichle vale lastindex ke 1 + karke hoga
           }
       } 
        return out;
    }
}