class Solution {
    public boolean isNumber(String s) {
        //ismein pehle loop chalayege ki konsa no decimal hai ya integer hai then uske ander condition lagayege
        /*int i=0;
        int sign =1;
        
        public boolean isdecimal(String s){
             try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
             }*/
        boolean digit = false,dot=false,efind=false;
        int countsign=0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            //digit ke valid check karne ke liye condition
            if(Character.isDigit(ch)){
                digit=true;
            }
            else if(ch=='+' || ch=='-'){
                if(countsign ==2){
                    return false;
                }
                if(i>0 &&(s.charAt(i-1)!='e' && s.charAt(i-1)!='E')){
                    return false;
                }
                if(i==s.length()-1){
                    return false;//means to check last character
                }
                countsign++;
            }
            //dot
            else if(ch=='.'){
                if(efind || dot){
                    return false;
                }
                if(i==s.length()-1 && !digit){
                    return false;
                }
                dot=true;
            }
            else if(ch=='e' || ch=='E'){
                if(efind || !digit || i==s.length()-1){
                    return false;
                }
                efind=true;
            }
            else{
                return false;
            }
        }
        return true;
        }
        
}
/*class Solution {
    public boolean isNumber(String s) {
        boolean digit = false, dot = false, efind = false;
        int countsign = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Digit check
            if (Character.isDigit(ch)) {
                digit = true;
            } else if (ch == '+' || ch == '-') {
                if (countsign == 2) {
                    return false;
                }
                if (i > 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) {
                    return false;
                }
                if (i == s.length() - 1) {
                    return false; // Check for the last character
                }
                countsign++;
            } else if (ch == '.') {
                if (efind || dot) {
                    return false;
                }
                if (i == s.length() - 1 && !digit) {
                    return false;
                }
                dot = true;
            } else if (ch == 'e' || ch == 'E') {
                if (efind || !digit || i == s.length() - 1) {
                    return false;
                }
                efind = true;
            } else {
                return false; // Invalid character
            }
        }

        return digit;
    }
}*/

