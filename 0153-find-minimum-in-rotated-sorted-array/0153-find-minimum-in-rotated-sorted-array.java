class Solution {
    public int findMin(int[] nums) {
       /* int start=0;
        int end=nums.length-1;
        int i;
        int min = nums[0];
        while(start<end){
            for(i=0;i<end;i++){
            if(nums[i]<nums[i+1])
                min=nums[i];
            }
            if(nums[i]==0){
                return 0;
            }
            start++;   
        }
        return min;*/
        int low=0;
        int high = nums.length-1;
        int res=nums[0];
        while(low<=high){
            int mid= (high+low)/2;
            if(nums[low]<=nums[high]){//means if full array sorted ho
                res=Math.min(res,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){//means left part sort hua toh hum check karege
                res=Math.min(res,nums[low]);
                low=mid+1;
            }
            else{
                res=Math.min(res,nums[mid]);
                high=mid-1;
            }
        }
        return res;
    }
}