class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        //in this we have to count the no. of triplets toh uske liye ek counter variable lenge
        int count = 0;//brute force h aur ismein easy h but time complexity hard h
        for(int i = 0;i<nums.length-2;i++){
            for(int j = i+1 ;j<nums.length-1;j++){
                for(int k = j+1 ;k<nums.length;k++){
                    if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) count++;
                }
            }
        }
        return count;
    }
}