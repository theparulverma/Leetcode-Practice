class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int j=0;
        int nosub=0;//means no. of subarray
        HashMap<Integer,Integer> table = new HashMap<>();//map ki ek no kitni baar aaya 
        table.put(0,1);
        for(j=0;j<nums.length;j++){
            sum += nums[j];
            nosub += table.getOrDefault(sum-goal,0);
            table.put(sum,table.getOrDefault(sum,0)+1);
        }
        return nosub;
    }
}