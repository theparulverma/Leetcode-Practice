class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0; i<s.length();i++){
             char ch = s.charAt(i);
            if(ch == '['){
                st.push(ch);
            }
            else {
                if(st.isEmpty() || st.peek() == ']'){
                    st.push(ch);
                }
            else{
                st.pop();//iss loop se humne stack mein aapni total brackets nikale by help of size function iss stack mein vohi element push hue jinke pair the hamare string mein according to concept agar mathametical soche toh open/ close bracets aa jayege use half karke then usmein +1 /2 karke minimum no of swaps aa jayege
            }
        }
        }
        int totalbracket = st.size();
        int open = totalbracket/2;
        int minswap = (open+1)/2;
        return minswap;
    }
}