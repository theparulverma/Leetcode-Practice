class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        for(char c : s.toCharArray()){
            freq[c]++;//this loop for calculating the frequency of each character in string
        }
        Character[] chars = new Character[256];
        for(int i =0;i<chars.length;i++){
            chars[i]=(char)i;
        }
        Arrays.sort(chars,(a,b)->freq[b]-freq[a]);//freq vale array ko descendind order mein sort
        
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            for(int i =0;i<freq[c];i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}