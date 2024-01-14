class Solution {
    public List<String> letterCasePermutation(String s) {
        //strings convert to uppercase one by one
         List<String> ll = new ArrayList<>();
        if(s.length()==0){
           return ll; 
        }
        letter(ll,0,s.toCharArray());
        return ll;
    }
    public void letter(List<String> ll,int idx,char[] word){
        //for(int i =idx;idx<word.length();i++){
        //    ll.add(word.charAt[i]);
        //}
        //first we will use base class
        if(idx == word.length){
            ll.add(new String(word));//ki agar idx puri word ki length complete kar leta hai aur ismein add ho jayegaaa list mein all combinations of that word
            return;
        }
        if(Character.isDigit(word[idx])){
            letter(ll,idx+1,word);//agar word letter hi na ho digit ho toh isliye yeh case aur bass idx+1 kar denge
            return;
        }
        else{
            word[idx]=Character.toUpperCase(word[idx]);//lowercase hua toh uppercase and vice versa
            letter(ll,idx+1,word);
            
            word[idx]=Character.toLowerCase(word[idx]);
            letter(ll,idx+1,word);
        }
    }
}