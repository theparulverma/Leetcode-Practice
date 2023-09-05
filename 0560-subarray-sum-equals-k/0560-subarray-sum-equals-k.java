class Solution {
    public int subarraySum(int[] nums, int k) {
        //return the subarray jinka element plus karke k ke equal aa raha h.
        //hash map will store values in pair
        HashMap<Integer,Integer> arr = new HashMap();
        arr.put(0,1);
        int sum=0;
        int result=0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];//total sum ex -3
            if(arr.containsKey(sum-k)){//3-2=1 means kya hashmap mein 1 hai yes of course then result add hoga
    result += arr.get(sum-k);            
            }
            arr.put(sum,arr.getOrDefault(sum,0)+1);
        }
        return result;
    }
}