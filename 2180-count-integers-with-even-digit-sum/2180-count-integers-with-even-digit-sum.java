class Solution {
    public int countEven(int num) {
        int count=0;
        int i;
        for(i=1;i<=num;i++){
            if(sumofDigit(i) % 2==0){
                count++;
            }
        }
        return count;
    }
    public int sumofDigit(int n)
    {
        int sum=0;
        int r;
        while(n!=0){
         r=n%10;
         sum=sum+r;
         n=n/10;   
        }
        return sum;
    }
}