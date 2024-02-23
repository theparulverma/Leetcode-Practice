    /* int once;
        int ans [] = new int[2];
        HashMap<Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);//in this if element is already present in the map then remove the number from hashmap and then the value which are occuring only at once voii hashmap mein bachegii
            }
            else{
                map.add(nums[i]);
            }
        }
        int i=0;
        for(int value: map.values()){
            ans[i++]= value;
        }
       return ans; 1st approach using hashset
        //2nd approach using bit manipulation
class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        for(int i =0;i<32;i++){
            int sum =0;
            for(int j =0;j<nums.length;j++){
                if(((nums[j]>> i)&1)==1){
                    //means bit set hai
                    sum++;
                    sum = sum%2;
                }
            }
            if(sum != 0){
                //means number is present only one time
                ans[0] |= sum <<i;
                ans[1] |= sum << (i+1);
            }
        }
        return ans;
    }
}*/
/*class Solution {
    public int[] singleNumber(int[] nums) {
        int xor =0;
        for(int i =0;i<nums.length;i++){
            xor = xor^nums[i];//xor calculate kiya saari values ka jo ki aaya 6 
        }
     int rightmostsetbit =1;//means position of rightmostbit ki position nikalege uske basis pe 2 groups mein divide karege position aayi 1th position pe value set hai means 1 hai
    for(int i =0;i<nums.length;i++){
        if(((nums[i]>> xor)&1)==1){
            rightmostsetbit <<=1;
        }
    }
    int value1=0;
       int value2=0;
     for(int num:nums){
        if((num & rightmostsetbit) ==0){//aab jo value hogi nums[i] aur 1 ko and karege toh 0 aaya means uski 1 th position pe 1 tha soo saari value aa gayi 2,3,2 as we know jab hum 2^2 =0 and 0^3 = 3 soo yeh value aa jayegi 
            value1= value1^num;
        }
         else{
             value2 = value2^num;
         }
         }
            return new int[]{value1,value2};                               
    }
}*/

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i]; // calculate XOR of all numbers
        }

        int rightmostsetbit = 1;
        while ((rightmostsetbit & xor) == 0) {
            rightmostsetbit <<= 1; // find the rightmost set bit in XOR
        }

        int value1 = 0;
        int value2 = 0;

        for (int num : nums) {
            if ((num & rightmostsetbit) == 0) {
                value1 ^= num;
            } else {
                value2 ^= num;
            }
        }

        return new int[]{value1, value2};
    }
}
