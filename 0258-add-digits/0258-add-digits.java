class Solution {
    public int addDigits(int num) {
       /* int rem;
        int sum=0;
        if(num==0){
            return 0;
        }
        while(num>0){
            num=num/10;
            rem=num%10;
            sum=sum+rem;
        }
        while(sum>0){
            num=num/10;
            rem=num%10;
            sum=sum+rem;
        }
        return sum;
    }
}*/
        if(num==0)return 0;
        if(num % 9==0)return 9;//means only 1 digit number
        return num%9;//direct mode nikal do
    }
}