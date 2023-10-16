class Solution {
    public long countSubarrays(int[] nums, long k) {
        int start =0,end=0;
        long count =0, sum=0;
        while(end<nums.length){
            sum += nums[end];
            while(sum*(end-start+1)>=k){//means hume less chaiye na sum k se toh isliye sum mein se value - karege
                sum -= nums[start];
            start++;
        }
        count += (end-start+1);
        end++;
    }
    return count;
    }
}