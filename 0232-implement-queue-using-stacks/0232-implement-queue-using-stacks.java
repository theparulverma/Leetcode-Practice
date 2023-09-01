class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1){
            helper.push(st.pop());//hum ehlper wale stack mein push karege and st vale se pop kara kar toh jaise stack mein[1,2,3,4] then hlper stack mein [4,3,2]
        }
        int x =st.pop();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;
    }
    
    public int peek() {
        while(st.size()>1){
            helper.push(st.pop());//hum ehlper wale stack mein push karege and st vale se pop kara kar toh jaise stack mein[1,2,3,4] then hlper stack mein [4,3,2]
        }
        int x =st.peek();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;
        
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