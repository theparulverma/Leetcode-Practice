class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int ind_a = -1;
        int ind_b = -1;
        int ind_c = -1;
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='a'){
                ind_a=i;
            }
            else 
                if(x=='b'){
                    ind_b=i;
                }
            else
                ind_c=i;
            if (i > 1) {
                count += Math.min(Math.min(ind_a, ind_b), ind_c) + 1;
            }
        }
        return count;
    }
}