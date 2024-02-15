class Solution {
          public long MOD=1_000_000_007;
    public int countGoodNumbers(long n) {
        //even pe even aur odd pe prime
        //n=1 means 1 length ki string ke good numbers count
        //i%2==0 means it is even number so ans*5// means 0,2,4,6,8
        //if not means odd toh ans *4;/2,3,5,7 are prime as mentioned odd place pe prime
        //ans %= mod,mod means 10^9+7;
        //n/2=2;means 2 odd places h/ example 5 in n=5 we have 2 places for odd
        //for even (n+1)/2 =for even places for even at n=5 we have 3 even places
        //so ans = (5^even)*(4^odd)//
        //now when power odd example 2^9 toh 2^4*2+1 aaisi recursive function mein pass kardege
  
        long even = (n+1)/2;
        long odd =n/2;
        long first =count(5,even)%MOD;//MEANS 5 BASE USKI POWER VOH EVEN INDCIES KI PLACE
        long second =count(4,odd)%MOD;
        return (int)((first*second)%MOD);
    }
    public long count(long x, long n){//x base number hai n power h
        if(n==0) return 1;//agar power 0 hai toh 1 hi answer hoga
        long temp = count(x,n/2);
        if(n%2==0){
            return (temp*temp)%MOD;
        }else{
            return(x*temp*temp)%MOD;
        }
    }
}