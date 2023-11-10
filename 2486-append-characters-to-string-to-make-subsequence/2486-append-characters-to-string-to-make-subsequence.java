class Solution {
    public int appendCharacters(String s, String t) {
        
       /* int c =0;
        if(s.equals(t)){
            return 0;
        }
        while(!s.equals(t)){
            for(int i =0 ;i<s.length()-1;i++){
                if(s.charAt(i)!=t.charAt(i))
                    c++;
            }
        }
        return c;*/
        int i =0;
        int j =0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
            j++;
        }
            i++;
        }
        return t.length()-j;
    }
}
