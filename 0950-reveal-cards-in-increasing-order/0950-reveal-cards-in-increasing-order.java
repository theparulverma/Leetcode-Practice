class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck.length == 2){
            return deck;
        }
        int n = deck.length;
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            dq.offer(i);//offer funtion in deque helps to add element in the double ended queue
        }
        int[] result = new int[n];
        for(int card:deck){
            result[dq.poll()]=card;//poll function help karta h double ended queue ke first element ko remove karne ke liye aur retrieve ke liye bhi
            if(!dq.isEmpty()){
                dq.offer(dq.poll());//means jo element nikla h queue se usko add kar lege baad mein queue mein hi
            }
        }
        return result;
    }
}