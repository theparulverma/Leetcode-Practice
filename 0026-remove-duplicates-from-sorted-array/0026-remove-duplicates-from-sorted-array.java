class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=0;
        int i=0;
        for(i=0;i<n;i++)
        {
            int temp=nums[i];
            while(i<n && nums[i]==temp)
            i++;
            nums[k]=temp;
            k++;
            i--;
        }
        return k;
        }
    }