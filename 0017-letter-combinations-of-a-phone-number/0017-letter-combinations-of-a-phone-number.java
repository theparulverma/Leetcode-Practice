class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
        if(digits.length()==0){
            return ll;
        }
            printanswer(digits,"",ll);
        return ll;
    }
    static String[] code ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printanswer(String ques, String ans,List<String> ll){
        if(ques.length() == 0){
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = code[ch-48];//abc
       for(int i =0;i<press.length();i++){
            printanswer(ques.substring(1),ans+press.charAt(i),ll);
        }
        
    }
}