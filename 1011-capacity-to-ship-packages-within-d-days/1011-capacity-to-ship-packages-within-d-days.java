class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =weights[0];
        int high = weights.length;
        for(int i=0;i<weights.length;i++){
            high += weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high){
            int mid = (high+low)/2;
            if(countdays(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int countdays(int[] weights,int cap){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days++;
                load=weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
}