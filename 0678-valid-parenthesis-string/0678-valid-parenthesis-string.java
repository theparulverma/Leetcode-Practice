import java.util.Stack;

public class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();//2 stack banaye jismein 1 vala toh open brackets ke liye /
        Stack<Integer> star = new Stack<>();//dusra vala star ke liye 
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {//agar open bracket hua toh push karege open vale stack mein
                open.push(i);
            } else if (s.charAt(i) == '*') {
                star.push(i);//nhi toh agar star hua toh star vale stack mein push karege
            } else {
                if (!open.isEmpty()) {
                    open.pop();// aur agar close bracket hua toh pop kar denge 
                } else if (!star.isEmpty()) {
                    star.pop();//same with * vale ke saath
                } else {
                    return false;
                }
            }
        }
        
        // Now process leftover opening brackets
        while (!open.isEmpty()) {//aab jo baache hue open brackets h
            if (star.isEmpty()) {
                return false;
            } else if (open.peek() < star.peek()) {
                open.pop();
                star.pop();
            } else {
                return false;
            }
        }
        
        return true;
    }
}
