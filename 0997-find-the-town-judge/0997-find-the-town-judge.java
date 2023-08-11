class Solution {
    public int findJudge(int n, int[][] trust) {
     //ismein it means agar n=2 hai toh town judge voh hoga jismein n=1 pe 2 ke saath combine kar raha ek type se trust toh 1 nhi aayega ,2 kis ke bhi saath nhi hai toh town judge 2 hogaa.
        int[] count = new int[n+1];
        for(int[] t: trust){
            count[t[0]]--;
            count[t[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i] == n-1) return i;
        }
        return -1;
    }
}