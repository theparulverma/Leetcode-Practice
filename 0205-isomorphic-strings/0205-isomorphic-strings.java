class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len1=s.length();
        int len2=t.length();
            if(len1 != len2){
                return false;
            }
          HashMap<Character,Character>mp1=new HashMap<>();//this for checking the character of 1 string to other
        HashMap<Character,Boolean>mp2=new HashMap<>();
        for(int i =0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(mp1.containsKey(c1)==true){
                if(mp1.get(c1)!=c2)
                    return false;
            }
            else
            {
            if(mp2.containsKey(c2)==true)
                return false;
                else{
                    mp1.put(c1,c2);//pehle yeh chalege
                    mp2.put(c2,true);
                }
            }
        }
        return true;
    }
}