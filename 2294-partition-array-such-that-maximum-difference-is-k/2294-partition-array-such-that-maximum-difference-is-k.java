class Solution {
    public int partitionArray(int[] nums, int k) {
        int result =0;
        Arrays.sort(nums);
        int n = nums.length;
       /* int min = Integer.MAX_VALUE;
        for(int i = nums.length-1; i >= 0 ;i--){
            int max = nums[i];
            if(max-min > k){//it means yeh condition agar violet ho gayi toh hum naya subsequence start karege bcoz we want differnce = k
                min = max;
                result++;
            }
        }
        if (nums.length > 0) {
    result++;
        }
        return result;*/
        for(int i =0;i<n;){
            result++;
            int max = nums[i]+k;
            while(i<n && nums[i] <= max){
                i++;
            }
        }
        return result;
    }
}
