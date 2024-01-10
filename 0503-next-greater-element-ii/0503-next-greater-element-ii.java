class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result,-1);//hum jo result array h usmein by default -1 value store kari hai
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n*2;i++){//2*n isliye kiya hai jis se circular array ko handle kar paye hum
            int index=i%n;//jis se correct index mil jaye
            while(!st.isEmpty() && nums[index]>nums[st.peek()]){
                int popindex = st.pop();
                result[popindex] = nums[index];
            }
            if(i<n){
            st.push(index);//only pushing the indcies
        }
        }
        return result;
    }
}
