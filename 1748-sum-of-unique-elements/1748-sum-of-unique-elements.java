class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int i;
        int res=0;//count variable
        for(int n : nums) count[n]++;
        for(i=0;i<101;i++){
            if(count[i]==1){
                res+=i;
        }
        }
        return res;
    }
}