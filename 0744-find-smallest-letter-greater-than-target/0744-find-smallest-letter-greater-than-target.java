class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid;
        if(letters[end]<=target ||target< letters[0])//means hume target se bada hona chaiye means sirf a se bada that is c jo ki first index pe hi hai toh voi return kara denge aage ki condition check karne ki zarrurat nhi h
        {
            return letters[0];
        }
        while(start+1<end){
            mid = start+(end-start)/2;
            if(letters[mid]<=target){
                start=mid;
            }
            else 
                end=mid;
        }
       return letters[end]; 
    }
}