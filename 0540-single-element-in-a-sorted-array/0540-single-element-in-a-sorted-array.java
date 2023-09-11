/*class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(mid%2==0){//for even middle no. means mid karne se 2 parts meinn divide hua 
                if(nums[mid]==nums[mid-1])
           //means agar hume side vala bhi same mil gaya toh voh nhi hoga 
                    low=mid-2;//hum left mein check karege toh //low=3
                    else if(nums[mid]==nums[mid+1])
                        high=mid+2;//high =7
                        else
                            return nums[mid];
                    }
                else{
                    if(nums[mid]==nums[mid-1])
                        low=mid+1;
                    else 
                        high=mid-1;
                }        
        }
            return nums[low];
    }
}*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (mid % 2 == 1) {
                mid--; // Ensure that mid is even
            }

            if (nums[mid] != nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 2;
            }
        }

        return nums[low];
    }
}