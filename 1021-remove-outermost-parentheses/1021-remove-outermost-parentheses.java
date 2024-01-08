class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        //int open =0;
        //int close=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!st.isEmpty()){//it means agar stackmkhaali nhi hai toh result mein add kardo bracket aur agar khaali hai toh mat add karo jis se ki jo outer vala bracket hai voh add nhi hoga result mein
                    ans.append(s.charAt(i));
                }
                st.push(s.charAt(i));
               // open += 1;
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    ans.append(s.charAt(i));
                 //close += 1;
                }
            }  
        }
        return ans.toString();
        
    }
}