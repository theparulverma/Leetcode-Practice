class Solution {
   /* public double myPow(double x, int n) {
        double result = 1.0;
         long nn = n;
        if(nn<0) nn = -1* nn;
        while(nn){
            if(nn % 2){
                result=result*x;
                nn=nn-1;
            }
            else {
                x=x*x;
                nn=nn/2;
            }
        } 
        if(n<0)  result= (double)(1.0) / (double)(result);
        return result;
    }*/
    private double pow_util(double x,long n)
    {
        if(n==0) return 1.0;
        if(n==1) return x;
        if(n<0)  return pow_util( 1/x, -n);
        double result = pow_util(x*x, n/2);
        if(n%2 == 1) result *= x;
        return result;   
    }
    public double myPow(double x,int n){
        return pow_util(x,n);
    }
}