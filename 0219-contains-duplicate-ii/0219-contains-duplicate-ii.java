/*class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,p;
        int n= nums.length-1;
        for(i=0;i<n;i++)
        {
         p=i-n;
         n--;
        if(nums[i]==nums[n]&& p<=k)
        return true;
        }
        return false;
        
    }
}*/
/*class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}*/
class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
 int n = nums.length;
        HashSet<Integer> check = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (check.contains(nums[i])) {
                return true;
            }

            check.add(nums[i]);

            // Maintain a sliding window of size k
            if (check.size() > k) {
                check.remove(nums[i - k]);
            }
        }

        return false;
    }
}