class Solution {
    public int largestAltitude(int[] gain) {
        //pehle yeh jayegaa 0 se -5 phir +1 hoga toh -4 jayega phir +5 toh ayega 1 se 0 phir -7  toh highest 1 aayegaa.
        int max=0;
        int current=0;//means voh variable jismein value increase aur decrease ho rahi h.
        for(int i=0;i<gain.length;i++){
            current += gain[i];
            max = Math.max(current,max);
        }
        return max;
    }
}