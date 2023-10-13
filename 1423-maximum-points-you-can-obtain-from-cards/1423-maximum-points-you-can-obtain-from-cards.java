class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int sum =0;
        for(int i=0;i<cardPoints.length;i++){
            sum += cardPoints[i];
        }
        int ans=0;
        int window=0;
        int n=cardPoints.length;
        if(n==k)
            return sum;
        for(int i=0;i<n-k-1;i++){
            window += cardPoints[i];//ek aage se value count karne ka sum upto k limit 
        }
        for(int i=n-k-1;i<n;i++){
            window += cardPoints[i];
            ans = Math.max(ans,sum-window);
            window -=cardPoints[i-(n-k-1)];
        }
        return ans;
    }
}