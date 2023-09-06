class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> res = new ArrayList<>();
        /*int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==nums[i+1])
                count++;
        }
        return count;*/
        //ismein hum 2 count variable lenge kyuki list mein 2 hi element majority mein hoge kyuki n/3 times means if n = 6 n/3 times means more than 2 times//we use boyer moore's voting algorithm
        int num1=-1;
        int num2=-1;
        int c1=0;
        int c2=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==num1)
                c1++;
            else if(nums[i]==num2)
                c2++;
            else if(c1 == 0){
                num1=nums[i];
                c1=1;
            }
            else if(c2 == 0){
                num2=nums[i];
                c2=1;
            }
            else{ 
                c1--;
            c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==num1)
                c1++;
            else if(nums[i]==num2)
                c2++;
        }
        if(c1>nums.length/3)
            res.add(num1);
        if(c2>nums.length/3)
            res.add(num2);
        return res;
    }
}