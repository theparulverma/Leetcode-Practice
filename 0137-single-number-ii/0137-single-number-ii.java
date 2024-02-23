class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        //int sum =0;
        // for checking the bit is in on bit we if(a&(1<<i))//a is number ith is which ith bit we wanna check. 1<<i means leftshift kiya 
        //represnt all numbers in binary number and check if the bit is on or off then on means set bit 
        //setbit%3 ==1 vohi +1 means voh hamra answer hoga aur 3 baar occur nhi kar raha  and aGagar 0 aayega toh it means voh 3 baar occur ho raha h number 
        for(int i =0;i<32;i++){
            int sum =0;
            for(int j =0;j<nums.length;j++){
                if(((nums[j] >> i) &1)==1){
                    sum++;
                    sum = sum % 3;//voh jo sum ki value 3 aayi it means it is not zero
                }
            }
            if(sum!=0){
                ans |= sum << i;//convert the sum value into integer
            }
        }
        
        return ans;
    }
}