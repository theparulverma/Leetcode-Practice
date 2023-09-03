class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){//3>4aacha means jo hume note karke condition given hai voh ek baar hi honi chaiye toh sorted and rotated dono hoga4>0
                count++;
            }
            if(count>1){
                return false;
            }
        }
   return true;
    }
}