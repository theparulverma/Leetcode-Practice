class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //we are using hashmap for removing runtime error 
        HashMap<Integer,Boolean> map = new HashMap<>();
        return search(s,0,wordDict,map);
        //return true;
    }
    public boolean search(String s,int pos,List<String> wordDict,HashMap<Integer,Boolean> map){
        if(pos==s.length()){//pos means position jo ki pehle 0 hi hogi
            return true;//means voh jo string hai hum uske length tak phoch gaye toh return true kardo
        }
        if(map.containsKey(pos)){
            return map.get(pos);
        }
        for(int i =0;i<wordDict.size();i++){
            String word = wordDict.get(i);//yeh loop lagaya jis se hum uss dictionary mein se harr word extract kar paaye
            int len = word.length();
            if(pos+len<=s.length() && s.substring(pos,pos+len).equals(word)){
                if(search(s,pos+len,wordDict,map)){
                     // map.put(pos,true);
                    return true;//yeh humne backtrack kiya to check aur agar yeh condition jismein jo word equal ho jayegaa pos+length of word se
                  
                }
            }
        }
        map.put(pos,false);
                   return false;
    }
}