class Solution {
    public String removeStars(String s) {
       /* int n = s.length();//e will use stack in which we push the elements but whenever we see a star we pop the element from stack
        //use two pointers i for moving in the whole string and j for whenever it is in stack we pop elements
        int j=0;
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                j--;
            }
            else{
                s.charAt(j)=s.charAt(i);
                j++;
            }
        }
        return s.substring(0,j);*/
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                st.push(ch);
                continue;
            }
            else{
                st.pop();
            }
            
        }
        if(st.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());//yeh loop pop karke elements ko sb string mein append kar raha h means jod raha h 
        }
        return sb.reverse().toString();//yeh uss sb string ko reverse karke normal string mein convertt kar diya
    }
}