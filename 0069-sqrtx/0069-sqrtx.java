class Solution {
    public int mySqrt(int x) {
        int start =1;
        int end =x;
        int mid;
        int res=0;
        while(start<=end){
            mid=(start+end)/2;//2
            if(mid <= x/mid){//2<=2
                start=mid+1;//3
                res=mid;//to stor th3 output in this i.e 2
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
}