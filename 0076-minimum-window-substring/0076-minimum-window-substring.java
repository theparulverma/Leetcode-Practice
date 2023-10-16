/*class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0 || s.length()<t.length()){
            return " ";
        }
        int[] v = new int[256];
        for(int i=0;i<t.length();++i)
            v[t.charAt(i)]++;//means jitne letter chaiye hume string mein usse ek aur array mein kar liya humne
        int start=0;
        int end=0;
        int anstart=0;
        int min= Integer.MAX_VALUE;
        int count =0;
        while(end < s.length()){
           if(v[s.charAt(end)] > 0)
                count++;//it means we are including that character in our window it means agar voh element present h toh hamari s string mein
            
            v[s.charAt(end)]--;
            
            while(count==t.length()){
                if(min>end-start+1){
                    min=end-start+1;
                    anstart=start;
                }
                v[s.charAt(start)]++;
                if(v[s.charAt(start)]>0)
                    count--;
                start++;
            }
            end--;
        }
        
        if(min == Integer.MAX_VALUE){
            return " ";
        }
        return s.substring(anstart,min);
    }
}*/
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length())
            return "";

        int[] v = new int[256];
        for (int i = 0; i < t.length(); ++i)
            v[t.charAt(i)]++;

        int start = 0, end = 0, ansStart = 0;
        int minLength = Integer.MAX_VALUE;
        int count = 0;

        while (end < s.length()) {
            if (v[s.charAt(end)] > 0)
                count++;

            v[s.charAt(end)]--;

            while (count == t.length()) {
                if (minLength > end - start + 1) {
                    minLength = end - start + 1;
                    ansStart = start; // Starting index of the answer
                }

                v[s.charAt(start)]++;
                if (v[s.charAt(start)] > 0)
                    count--;

                start++;
            }
            end++;
        }

        if (minLength == Integer.MAX_VALUE) // No substring found
            return "";

        return s.substring(ansStart, ansStart + minLength);
    }
}
