class Solution {
    public int triangleNumber(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i = 2;i<nums.length;i++){
            int left =0;
            int right=i-1;
            while(left<right){
            if(nums[left]+nums[right]>nums[i]){
                c += (right-left);
                right--;
            }else{
             left++;   
            }
        }
        }
        return c;
    }
}