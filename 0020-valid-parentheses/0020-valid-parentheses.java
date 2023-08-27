class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch == '{' || ch =='['){
                st.push(ch);
            }
            else{ 
                if(ch == ')' && !st.isEmpty() && st.peek()== '('){
                    st.pop();
                }
                else if(ch == '}' && !st.isEmpty() && st.peek()== '{'){
                    st.pop();
                }
                else if(ch == ']' && !st.isEmpty() && st.peek()== '['){
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
    }
}