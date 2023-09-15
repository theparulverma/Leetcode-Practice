/*class Solution {
    public String largestGoodInteger(String num) {
        char c ='\0';
        for(int i =1;i+2<num.length();i++){
            char c1 = num.charAt(i-1);
            char c2 =num.charAt(i);
            char c3 = num.charAt(i+1);
            if(c1 == c2 && c2 == c3){
                if(c == '\0' || c2>c){
                    c=c2;//it means voh no hum c mein store kar lenge jo teen baar aa raha h
                }
            }
        }
        if(c=='\0'){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<3;i++){
            sb.append(c);
        }
        return sb.toString();
    }
}*/
class Solution {
    public String largestGoodInteger(String num) {
        char c = '\0';
        for (int i = 1; i + 1 < num.length(); i++) {
            char c1 = num.charAt(i - 1);
            char c2 = num.charAt(i);
            char c3 = num.charAt(i + 1);
            if (c1 == c2 && c2 == c3) {
                if (c == '\0' || c2 > c) {
                    c = c2;
                }
            }
        }
        if (c == '\0') {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}