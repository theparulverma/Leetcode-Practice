class Solution {
    public int fib(int n) {
        //0 1 1 2 3 5 8 
        //base condition //second function jis se call kara sake
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
    }
}