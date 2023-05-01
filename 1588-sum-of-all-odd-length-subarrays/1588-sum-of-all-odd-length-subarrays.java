class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int start=i+1;//0+1//1+1//2+1//3+1//4+1=5
            int end=n-i;   //5-0//5-1//5-2//5-3=2//5-4=1
            int total=start*end;//1*5=5//4*2=8//3*3//4*2//5
            int odd =total/2;//5/2=2//8/2=//9/2=4//8/2=4//5/2=2
            if(total%2==1){//condition true;
                odd++;//3//5//3
            }
            result += odd*arr[i];//3*1=3//3+4*4=19//19+5*2=29//29+4*5=49//49+3*3=58
        }
      return result;  
    }
}