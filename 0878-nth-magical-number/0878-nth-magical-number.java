class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long A =a;
        long B =b;// for storing the value and soo that the actual value of a ,b will not change for taking out lcm
        long mod = 1_000_000_007;
        while(B>0){
            long t=A;
            A=B;
            B = t%B;
        }
        long lcm =(a*b)/A;
        
        long low= Math.min(a,b);
        long high = (long)n*Math.min(a,b);
        while(low<high){
            long mid = low+(high-low)/2;//mid =6
            //if
            if((mid/a)+(mid/b)-(mid/lcm)<n){ //mid/a is 3 and value[2,4,6] and mid/b is 2 and value[3,6] to remove duplicate value we apply lcm of a,b and divide it by mid and jo yeh aaya hai voh smaller j=hai mw=eans chota hai nth magical number ke toh right badhege means 4 se aage values ke liye check karege soo low = mid+1;
                low = mid+1;//it means agar jo hamara middle ki value hai 3+2-1=4
            }
            else
                high = mid;
        }
        return (int)(low % mod);
    }
}