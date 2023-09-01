class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
//pop efficient method
    public MyQueue() {
        
    }
    public void push(int x) {
        //st.push(x);
        if(st.size()==0) st.push(x);
        else{
            while(st.size()>0){
                helper.push(st.pop());
            }
            st.push(x);
            while(helper.size()>0){
                st.push(helper.pop());//means dusre vale stack mein voh value daalo st vale stack se pop kar ke jis se hamari sequence[1,2,3,4]bane
            }
        }
    }
    
    public int pop() {
        /*while(st.size()>1){
            helper.push(st.pop());//hum ehlper wale stack mein push karege and st vale se pop kara kar toh jaise stack mein[1,2,3,4] then hlper stack mein [4,3,2]
        }
        int x =st.pop();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;*/
        return st.pop();
    }
    
    public int peek() {
        /*while(st.size()>1){
            helper.push(st.pop());//hum ehlper wale stack mein push karege and st vale se pop kara kar toh jaise stack mein[1,2,3,4] then hlper stack mein [4,3,2]
        }
        int x =st.peek();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;*/
        return st.peek();
        
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */