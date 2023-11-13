class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        //ismein hume ek 2d array given h jismein hume passenger aur uske to and destination point given hai aab hume capacity mili hai like in example 1 usmein hume 1 se 5 point le janna hai 2 passengers ko and then 3 point beech mein aayege toh hum 3 passengers ko le lenge 3 point se but capacity is only 4 so 2+3=5 but yeh phir false ho jayegaa 
        int out[] = new int[1001];
        for(int t[] : trips){
            out[t[1]] += t[0];//means on board uspe kitne chade log unko plus kiya 
            out[t[2]] -= t[0];//means hum usmein se jo bhi element nikle usko subtract karege aur end mein yeh check karege ki agar greater hai zero se matlab capacity se jada usmein elements hai aur kam hai ya equal 0 se means true
        }
        for(int number:out){
            capacity -= number;
            if(capacity < 0)
                return false;
        }
        return true;
    }
}