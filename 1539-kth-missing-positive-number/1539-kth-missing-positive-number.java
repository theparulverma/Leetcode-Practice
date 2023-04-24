class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;//pehle missing no.nikalege phir uska jo 5th index pe no.hoga voh return karegge,
            if(arr[mid]-(mid+1) >=k){//means voh missing no.'s nikal rahe h nikala aur check kiya voh no.se greater hai//4-4+1=1 means sirf ek item missing h
                end=mid;
            }else {
                start=mid+1;
            }      
        }
        return start+k;
    }
}