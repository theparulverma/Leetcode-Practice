class Solution {
    public int arrangeCoins(int n) {
        //ismein hume example 8 input kara toh k=4 aayega (8*2)squart =4/ uske sum=k*(k+1)/2=4*5/2=10,sum>n,10>8//basically 10 are the pyramids jo bane hai stairs bani h,phir uske baache sum-n,4-1=3//row se ek kam jaise 3 row toh return 2.
        long k = (long)Math.sqrt(2*(long)n);
        long sum=k*(k+1)/2;
        if(sum>n)return (int)k-1;
        return (int)k;   
    }
}