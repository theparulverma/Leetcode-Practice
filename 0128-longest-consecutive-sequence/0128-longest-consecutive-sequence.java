class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>(); // Store all values in a set
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        for (int it : set) { // Iterate through the unique values in the set
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
