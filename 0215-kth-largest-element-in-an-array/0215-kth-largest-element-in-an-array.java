class Solution {
    public int findKthLargest(int[] nums, int k) {
        return Kthlargestelement(nums,k);
    }
            public static int Kthlargestelement(int[] arr,int k){
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i =0;i<k;i++){
             pq.add(arr[i]);//3 element insert kar lenge queue mein
         }
         for(int i =k;i<arr.length;i++){//3 ke baad se loop chalega
             if(arr[i]> pq.peek()){
                 pq.poll();//poll means remove kar diya
                 pq.add(arr[i]);
             }
         }
         return pq.peek();
     }

}