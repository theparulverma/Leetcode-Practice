class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        /*int n = matrix.length;
        int low = matrix[0][0];//1
        int high = matrix[n-1][n-1];//15
        while(low < high){
        int mid = (low + high)/2;
            int count =0;
            for(int i =0;i<n;i++){
                count += upperbound(matrix[i],mid);//we will call upperbound function for calculating ki mid se chote numbers kitne hai.assume mid = 12 
            }
            if(count<k){//agar count 5<8 so hum low = 12+1=13 aab yehi hamara last step hoga execution ka kyuki high =14 ho jayegaa.
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    public int upperbound(int[] array, int target){
         int left = 0;
        int right = array.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (array[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;*/
        int n = matrix.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(pq.size()<k) pq.add(matrix[i][j]);
                else{
                    if(pq.peek()>matrix[i][j]){
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
               }
            }
        }
        return pq.poll();
    }
}