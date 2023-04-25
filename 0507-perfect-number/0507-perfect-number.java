class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num==1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){//aur loop math.sqrt tak lagegaa kyuki no.of time kam execute ho
            if(num%i==0){
                sum=sum+i+num/i;
            }
        }//we have add num/i bcoz 28/2=14 aur 14 ek divisor h 28 ka.aur hume time complexity ke liye bhi sahi rahega            }
        return num==sum;//means agar no sum ke equal h tabhi true dega
    }
}