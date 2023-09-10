class Solution {
    public int[] searchRange(int[] nums, int target) {
       /* int[] res = new int[4];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target)
                res[0]=i;
        }*/
        int first = findfirstoccur(nums,target);
        int last = findlastoccur(nums,target);
        
        return new int[]{first,last};
    }
    private int findfirstoccur(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=high+low/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return index;
    }
    private int findlastoccur(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=high+low/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return index;
    }
}