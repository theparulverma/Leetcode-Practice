class Solution {
    public int partitionString(String s) {
       int result=0;
        /*for(int i =0;i<s.length();i++){
            if(!s.substring(0, i+1).equals(String.valueOf(s.charAt(i)))) //
            result++;
        }
        return result;*/
      
        HashSet<Character> unique = new HashSet<>();//humne yaha hashset use kiya naki hashmap kyuki hashset stores only unique values but hashmap stores key and associated with values jo same ho bhi sakti hai and may not be

        for (char ch : s.toCharArray()) {//for easy retrieving of each character humne string ko chararray mein convert kiya 
            if (!unique.contains(ch)) {//hashmap use karke hum substring bana rahe hai  agar jo uniquechar ka hashset hai usmein voh character nhi hai toh hum add kar dege hashset mein
                unique.add(ch);
            } else {
                // agar already hai toh new substring start karo
                result++;
                unique.clear(); // Clear set karo new substring ke liye
                unique.add(ch);
            }
        }
        if (!unique.isEmpty()) {
            result++;
        }

        return result;
    }
}