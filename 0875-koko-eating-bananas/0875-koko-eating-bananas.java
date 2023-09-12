class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //hume minimum integer k nikalna hai jis se koko can eat all bananas in 8 hours mein toh hum assume karege 3 bananas per hour ke hisab se 1+2+3+4=10 yeh bhi wrong hua,then 4 banans per hour karege
        int low=1;
        int high=findmax(piles);
        while(low<=high){
            int mid=(high+low)/2;
            int totalhr=totalhrs(piles,mid);
            if (totalhr <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
        
    }
    public int findmax(int[] a){
        int max=a[0];
        int n =a.length;
        for(int i =0;i<n;i++){
            max=Math.max(max,a[i]);
        }
        return max;
    }
    public int totalhrs(int[] a,int hourly){
        int total=0;
        for(int i=0;i<a.length;i++){
            total += Math.ceil((double)(a[i]) / (double)(hourly)); //ceil function round off karke badi ya next value deta tha
        }
        return total;
    }
    
}