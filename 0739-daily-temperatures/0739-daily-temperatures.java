class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
       // Arrays.fill(ans,0);
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;//to calculate ki jo voh index chal raha hai uss se kitna greater element hai aage, means kitne number
            }
            st.push(i);
        }
        //for(int i =0;i<n;i++){
          //  result[i]
        //}
        return ans;
    }
}