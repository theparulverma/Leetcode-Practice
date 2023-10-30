class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);//i matlab ki index uss string ka
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
            int index = st.pop();//pop karege top element stack ke
            sb.delete(index, index + 1);//stringbuilder mein toh puri string hainaa usmein se delete karege jo hume st mein push karaye h 
        }
        return sb.toString();
    }
}