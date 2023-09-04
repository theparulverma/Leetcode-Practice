class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1){//lexographically means maths ke number according bada ho 123 then 132 is greatear than it
            return;
        }
        int i = nums.length-2;//1 means 2 no uspe
        while(i>=0 && nums[i]>=nums[i+1]) i--;//break point
        if(i>=0){
            int j = nums.length-1;//j=2
            while(nums[j] <= nums[i]) j--;//1<=2
            swap(nums,i,j);//3,1,2//longer prefix match karke swap karege ex- 2 1 5 4 3  0 0
            //1 se sabse close 3 hai means bada toh hum check karege and swap 1 with 3
        }
        reverse(nums,i+1,nums.length-1);
    }
        /*while(i>j) 
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j++;
        }*/
        public void swap(int[] nums,int i,int j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
        }
    public void reverse(int[] nums,int i,int j){
        while(i<j) swap(nums,i++,j--);
            
    }
}