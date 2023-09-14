class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
      int low=1;
        int high =nums.length-1;
        int maxi =nums[0];
        if(nums.length > threshold) return -1;
        for(int i=0;i<nums.length;i++){
            maxi= Math.max(nums[i],maxi);
        }
         high=maxi;
          while(low<=high){
              int mid = (high+low)/2;
                  if(sumofdiv(nums,mid)<=threshold){
                      high=mid-1;//means hume aab aage lowest value dhundni hai smallest toh voh aage ki taaraf find karege
                  }
              else{
                  low=mid+1;
              }
          }  
        return low;
    }
    public int sumofdiv(int[] nums,int k){
        int sum=0;
        for(int i =0;i<nums.length;i++){//means jo array bheja h uski values check karege and divide karege aur ceil function use karege ji se ek aage ki value aaye round off karke
           sum += Math.ceil((double)(nums[i]) / (double)(k)); 
        }
        return sum;
    }
}