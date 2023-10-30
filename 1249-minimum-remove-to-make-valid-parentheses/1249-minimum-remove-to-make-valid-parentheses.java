class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else if(ch == ')')
            {
                if(!st.isEmpty() && s.charAt(st.peek())=='('){
                    st.pop();
                }
                else{
                    st.push(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder(s);
        while(!st.isEmpty()){
            int index = st.pop();
            sb.delete(index, index + 1);
        }
        return sb.toString();
    }
}