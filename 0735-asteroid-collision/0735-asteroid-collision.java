class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<asteroids.length;i++){
            int a = asteroids[i];
             int fl = 1;//it is flag variable it describes if 1 is there that no collison occurs and 0 means collision ho gaya 
        while(!st.isEmpty() && st.peek()>0 && a<0){//it means st mein jo value h voh positive value and a mein jo value h voh negative it meaans 1 positive and 1 value is negative
            if(Math.abs(a)==st.peek()){
                fl=0;
                st.pop();
                break;
            }
            else if(Math.abs(a)>st.peek()){//means negative vali value ko size jada nikal gaya toh hum jo stack ke peek pe value hai usko hata denge 
                st.pop();
            }
            else{
                fl=0;
                break;//it means agar negative vale asteroid ki value kam hai stack pe jo value hai toh f1=0 kardo aur stack ka asteroid asteroid mein hi rahega
            }
        }
             if(fl==1){
                 st.push(a);
             }
        }
        //aab jo hamara result hai voh stack mein hoga toh loop lageyge
         int [] result = new int[st.size()];
        for(int i =result.length-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result;
    }
}