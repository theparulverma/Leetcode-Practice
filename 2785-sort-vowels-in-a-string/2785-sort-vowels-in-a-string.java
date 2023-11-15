/*ass Solution {
    Character[] vows = {'a','e','i','o','u','A','E','I','O','U'};
    public boolean isvowel(char c){
        return Arrays.asList(vows).conatins(c);
            
    }
    public String sortVowels(String s) {
        StringBuilder sb = new Stringbuilder();
        List<character> vowels=new List<>();
        for(int i =0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                vowels.add(s.charAt(i));//uss list emin add karege hum vowels ko and then usko sort karege
            }
        }
        Collection.sort(vowels);
        int j =0;
        for(int i =0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                sb.append(vowels.get(j++));//means agar voh vowel hua toh stringbuilder mein uss character ko add karke uss vowels vali list ko aage badayege means move
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    Character[] vows = {'a','e','i','o','u','A','E','I','O','U'};
    
    public boolean isVowel(char c) {
        return Arrays.asList(vows).contains(c);
    }

    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> vowels = new ArrayList<>();
        
        int vowelIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowels.add(s.charAt(i));
            }
        }
        
        Collections.sort(vowels);

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                sb.append(vowels.get(j++));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}