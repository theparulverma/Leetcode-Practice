class Solution {
    public int strStr(String haystack, String needle) {
        int i;
        for(i=0;i<haystack.length();i++){
                if(haystack.charAt(i)==needle.charAt(0)){
                    //means hum needle ke pehle char ko check karege haystack ke i se means i ki increase hoti rahegi toh 1 pe i s aur needle pe bhi s toh jab andar aayege.
                    if(check(haystack,needle,i)==true) 
                        return i;
            }
        }
        return -1;
    }
     public boolean check(String haystack,String needle,int id)
     {
         int l1=haystack.length();
         int l2=needle.length();
         for(int i=0;i<l2;i++){
             if(id>=l1)return false;
             if(haystack.charAt(id++)!=needle.charAt(i))
                 return false;
         }
         return true;
     }
}