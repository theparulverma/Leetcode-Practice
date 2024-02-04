class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize!=0){
            return false;
        }
      PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i =0;i<hand.length;i++){
             pq.add(hand[i]);//3 element insert kar lenge queue mein for this first example 
         }
        while(!pq.isEmpty()){//aab jo queue hai voh empty nhi h
            int small=pq.poll();//jo sabse first value hogi voh aa jayegii 
            for(int i =1;i<groupSize;i++){
                if(pq.remove(small+i)) continue;
                else return false;
            }
        } 
        return true;
    }
}