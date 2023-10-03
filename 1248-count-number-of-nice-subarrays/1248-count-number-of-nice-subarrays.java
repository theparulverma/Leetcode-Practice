/*class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       //k=3 means uss subarray mein 3 odd number hone chaiye
        int i=0;
        int j=0;
        int count =0;
        int ans=0;
        for(j=0;j<nums.length;j++){
            if(nums[j]%2==1){
                count++;
            }
            while(count>k){
                if(nums[i]%2==1){
                 count--;
                }
                i++;
            }
            ans+= count;
            if (count == k) {
                int x = i;
                while (nums[x] % 2 == 0) {
                    x++;
                    ans++;
                }
            }
        }
        return ans;
    }
}*/
/*ass solution{
    int atmost(int[]nums,int k){
        int i=0;
        int j=0;
        int ans=0;
        while(j<nums.length){
            if(nums[j]%2==1){
                if(k>0)
                    k--;
                else{
                    while(nums[i]%2 !=1) i++;
                    i++;
                }
            }
            ans+= j+i-1;
            j++;
        }
        return ans;
    }
    public int numberOfsubArrays(int[] nums,int k){
     return atmost(nums,k)-atmost(nums,k-1);
    }
}*/
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;

        while (j < nums.length) {
            if (nums[j] % 2 == 1) {
                k--;
                count = 0;
            }

            while (k == 0) {
                if (nums[i] % 2 == 1) {
                    k++;
                }
                i++;
                count++;
            }

            ans += count;
            j++;
        }

        return ans;
    }
}
