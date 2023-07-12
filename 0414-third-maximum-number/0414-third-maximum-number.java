/*class Solution {
    public int thirdMax(int[] nums) {
        int max=0;
        int secondmax=0;
        int thirdmax=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==max || nums[i]==secondmax || nums[i]==thirdmax)
            {
                continue;
            }
            if(max==0 || nums[i]>max)
            {
            thirdmax = secondmax;
            secondmax = max;
            max = nums[i];
            }
            else if(secondmax==0 || nums[i]>secondmax)
            {
                thirdmax = secondmax;
                secondmax = nums[i];
            }
            else if(thirdmax==0 || nums[i]>thirdmax)
            {
                thirdmax = nums[i];
            }
        }
        if(thirdmax==0)
        {
        return max;
        }
        return thirdmax;
    }
}*/
class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : nums) {
            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == null) {
            return max;
        }
        return thirdMax;
    }
}