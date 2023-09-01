class RecentCounter {
    Queue <Integer> qt = new LinkedList<>();;
  
    public RecentCounter() {
    }
    
    public int ping(int t) {
        if(qt.size()==0){
            qt.add(t);//means jab khaali hoga queue toh add karke element return 1 mens size is only 1
            return 1;
        }
        else{
            if(t<=3000){
            qt.add(t);
        }
            else{
                int margin = t- 3000;
                while(qt.size()!=0 && qt.peek()<margin){
                    qt.poll();
                }
                qt.add(t);
            }
        return qt.size();
    }
}
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */