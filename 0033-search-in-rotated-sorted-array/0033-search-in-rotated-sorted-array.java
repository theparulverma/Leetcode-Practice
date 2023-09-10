class Solution {
    public int search(int[] nums, int target) {
        int low = 0;//0(logn)complexity means binary search
        int high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid =  low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low] <=nums[mid]){//if left part is sorted
                if(nums[low] <= target && target <= nums[mid]){
                    high=mid-1;
                }
                else
                    low=mid+1;
            }//right part sorted ke liye as rotated hai toh koi na koi index ke baad array sorted hoga
            else if(nums[mid]<=target && target<=nums[high]){//arr[mid] <= target && target <= arr[high]: 
                low=mid+1;
            }
            else
                high =mid-1;
        }
        return -1;
    }
}