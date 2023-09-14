class Solution {
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        for(int i =0;i<nums.length;i++){
            low= Math.max(low,nums[i]);
            high += nums[i];
        }
        while(low<=high){
            int mid = (high+low)/2;
            if(count(nums,mid)>k){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    public int count(int[] nums,int max){
        int partition=1;
        int split=0;
        for(int i =0;i<nums.length;i++){
            if(split+nums[i]<=max){
                split += nums[i];
            }
            else{
                partition++;
                split = nums[i];
            }
        }
        return partition;
    }
}