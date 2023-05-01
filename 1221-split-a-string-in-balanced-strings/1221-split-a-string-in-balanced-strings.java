class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int total=0;
        for(char ch: s.toCharArray()){
            if(ch == 'L')
                ++count;
            if(ch == 'R')
                --count;
            if(count == 0)//it means equal no.of L and R hai toh total ++ means itne balanced strings h
                total++;
        }
        return total;
    }
}