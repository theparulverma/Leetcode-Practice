class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //skip duplicates elements ko jis se 
        //triplet means nums[i]+nums[j]+nums[k]==0 hona chaiye phir 3 case lege equal,jada(more than),kam(lessthan) ,agar jada hua toh hum kum karne ki koshish karege sum means koii value uss se choti lenge,then kam hua toh we will increase the value so that sum will be equal to 0
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
                int left = i+1;
            int right = nums.length-1;
                while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));//jab hume ek saath bhaut value add karni hoti h toh ARRAY.as list karte h
                                    while(left<right && nums[left]==nums[left+1]) left++;//remove duplicates
                while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                    right--;
                }
                else if(sum<0)
                    left++;
                else
                    right--;
            }
        }
        }
        return res;
    }
}