class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String result ="";
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
            /*if (s.length() == 1 || result.length() > 0 && s.startsWith(result)) {
                result = s.length() > result.length() ? s : result;
            }//not applicable for all the cases 
        }*/
        for (String s : words) {
        if(s.length() > result.length() || (s.length() == result.length() && s.compareTo(result) < 0 )){
            boolean valid = true;
            for(int i =1;i<s.length();i++){
                if(!set.contains(s.substring(0,i))){
                    valid = false;
                    break;
                }
            }
        if(valid == true){
            result=s;
        }
        }
    }
        return result;
    }
}