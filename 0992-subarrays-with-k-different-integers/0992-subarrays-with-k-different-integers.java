class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return ok(nums,k)- ok(nums,k-1);
    }
    public int ok(int[] A, int K) {
        if (K == 0)
            return 0;
        
        int n = A.length;
        int total = 0;
        int diff = 0;
        int j = 0;
        int[] cnt = new int[20002];//humne ek array liya jismein count kar rahe h number 1 value kitni baar aayi

        for (int i = 0; i < n; i++) {
            if (cnt[A[i]] == 0) {//means voh element sirf 1 time h array mein
                diff++;
                cnt[A[i]]++;
            } else {
                cnt[A[i]]++;
            }

            if (diff <= K) {
                total += (i - j + 1);
            } else {
                while (j < n && j <= i && diff > K) {
                    cnt[A[j]]--;
                    if (cnt[A[j]] == 0)
                        diff--;
                    j++;
                }
                total += (i - j + 1);
            }
        }
        return total;
    }
}



