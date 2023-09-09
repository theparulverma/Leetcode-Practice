class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int back=1;//suffix
        int front=1;//prefix
        
        for(int i = 0;i<nums.length;i++){
            if(front==0) front=1;
        if(back==0) back=1;
        front *= nums[i];
        back *= nums[nums.length-i-1];
        res = Math.max(res,Math.max(front,back));
    }
    return res;
}
}