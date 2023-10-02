class Solution {
    public int longestOnes(int[] nums, int k) {
       //k=2 means hum 2 baar 0 flip karke max one finds kar sakte h.
        int zerocount=0;
        int i=0;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[i]==0) zerocount--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}