/*class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //list mein add karna hai first index plus last index ko 
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            if(check(s,i,p)){//it means check se jo value aayegi voh true hai toh 
               ans.add(i); 
            }
        }
        return ans;
    }
    public boolean check(String s, int idx,String p){   
        if (idx + p.length() <= s.length()) {
        String substringS = s.substring(idx, idx + p.length());
        // Compare the substring of s with p
        return substringS.equals(p);
    }
    return false;
    }
}*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ll = new ArrayList<>();
        char[] arrp = p.toCharArray();
        Arrays.sort(arrp);//pehle p string ko humne char array mein convert kiya then usko sort kar liya jiss se 3 letters tikh se ho and compare karne mein problem na ho
        p = new String(arrp);
        int size = p.length();
        for(int i =0;i<=s.length()-size;i++){
            String str = s.substring(i,i+size);//substring nikali 0 se leke utnii length tak and usse convert kiya char array mein now sort this aaray
            char[] arrs = str.toCharArray();
            Arrays.sort(arrs);
            str = new String(arrs);
            if(str.equals(p)){//aab dono string ki order tikh hogi as sort kar diya so check karege and then add karege list mein
                ll.add(i);
            }
        }
        return ll;
    }
}