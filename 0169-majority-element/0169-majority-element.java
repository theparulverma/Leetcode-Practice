class Solution {
    public int majorityElement(int[] nums) {
        /*Arrays.sort(nums);
        int k=0;
        int i;
        int max=nums[0];
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            return nums[i];
            k++;
            
        }
        return 0;*/
        Arrays.sort(nums);
        int n = nums.length;
        int majorityCandidate = nums[n / 2];
        int count = 0;

        for (int num : nums) {
            if (num == majorityCandidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return majorityCandidate;
        } else {
            return 0; // No majority element found
        }
    }

}