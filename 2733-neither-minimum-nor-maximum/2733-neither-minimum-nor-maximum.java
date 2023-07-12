class Solution {
    public int findNonMinOrMax(int[] nums) {
        int len = nums.length;
        if(len <= 2){//it means array mein sirf 2 elements hai toh maximum or minium dono honge beech ka koi value nhi hogaa soo yeh hamari base case ho jayegii
            return -1;
        }
        Arrays.sort(nums);
        return nums[1];
    }
}