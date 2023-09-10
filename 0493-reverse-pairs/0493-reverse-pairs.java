class Solution {
    public int reversePairs(int[] nums) {
        return merge(nums,0,nums.length-1);
    }
    
        static int mergefull(int[] nums,int low,int mid,int high){
            int count =0;
        int j = mid+1;//l means left ,r means right
            for(int i =low;i<=mid;i++){//left half of the array
                while(j<=high && nums[i] > (2*(long)nums[j])) {
                    j++;
                }
                count += (j-(mid+1));     
            }
            ArrayList<Integer> temp = new ArrayList<>();
            int left = low;
            int right = mid+1;
            while(left<= mid && right<=high){
                if(nums[left]<=nums[right]){
                    temp.add(nums[left++]);
                }
                else{
                    temp.add(nums[right++]);
                }
            }
            while(left<= mid){
                temp.add(nums[left++]);
            }
            while(right<=high){
                temp.add(nums[right++]);
            }
            for(int i =low;i<=high;i++){
                nums[i] = temp.get(i - low);
            }
            return count;
    }
    static int merge(int[] nums,int l,int r){
        if(l >= r) return 0;
        int mid =(l+r)/2;
       int inv= merge(nums,l,mid);//first half sort solve ho gaya
        inv += merge(nums,mid+1,r);//second half solved
        inv += mergefull(nums,l,mid,r);
        return inv;

    }
    
}