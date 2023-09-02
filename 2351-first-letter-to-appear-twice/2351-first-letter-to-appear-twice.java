class Solution {
    public char repeatedCharacter(String s) {
        int arr[] = new int[26];
        String ch = " ";
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i)- 'a']++;//it means humne string ko array mein kara aur -a hum isliye kar rahe h kyuki index nikala means ascii number of a ko a se - karke 0 aaya then a jo hai 1 baar aaya phit uske baad same as b then c aaya toh yeh 2 ho jayegaa it means first who appear twice
            if(arr[s.charAt(i)-'a']==2){
                ch=String.valueOf(s.charAt(i));//then usko string mein kiya uss word ka index nikal kar 
                break;
            }
        }
        return ch.charAt(0);
    }
}