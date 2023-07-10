class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        merge(nums,0,n-1);
        return nums;// 1 2 3 4 5
    } 
        static void displayarr(int[] nums){
        for(int val : nums){
            System.out.print(val + " ");
        }
    }
    static void mergefull(int[] nums,int beg,int mid,int end){
        int n1 = mid-beg+1;
        int n2 = end-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for(i = 0;i < n1; i++) left[i] = nums[beg+i];
        for(j = 0;j < n2; j++) right[j] = nums[mid+1+j];
        i=0;
        j=0;
        k=beg;
        while(i < n1 && j<n2){
            if(left[i] < right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        while(i<n1)
            nums[k++] = left[i++];
        while(j<n2)
            nums[k++] = right[j++];
    }
    static void merge(int[] nums,int beg,int end){
        if(beg >= end) return;
        int mid =(beg+end)/2;
        merge(nums,beg,mid);//first half sort solve ho gaya
        merge(nums,mid+1,end);//second half solved
        mergefull(nums,beg,mid,end);

    }
}