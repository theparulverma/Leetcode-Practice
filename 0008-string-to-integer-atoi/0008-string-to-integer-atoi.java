/*class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s[i]==" ")//to check the first condition ki agar space hoge toh ignore karege and aage badege
            i++;
        if(i>= s.length()){
            return 0;
        }
        int sign =1;
        if(s[i]=='+' || s[i]=='-')
        {
            sign=(s[i] == '+')?+1:-1;//ternary operator to check 2nd condition
            i++;
        }
                if(i>= s.length()){
            return 0;
        }
        int num=0;
        for(int i=0;i<s.length() && s[i]>='0' && s[i]<='9';i++){
            if(num>Integer.MAX_VALUE /10 ||(num==Integer.MAX_VALUE/10 && s[i] -'0' >Integer.MAAX_VALUE % 10))
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            num =num*10+s[i];
        }
        return num*sign;
        
    }
}*/
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') // Check for leading spaces
            i++;
        
        if (i >= s.length()) {
            return 0; // If the string is empty or contains only spaces
        }
        
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        }
        
        if (i >= s.length()) {
            return 0; // If the string contains only a sign character
        }
        
        long num = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            num = num * 10 + digit;
            i++;
        }
        
        return (int) (num * sign);
    }
}





