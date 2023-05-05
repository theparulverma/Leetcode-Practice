class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totaltime=0;
        int i;
        for(i=0;i<timeSeries.length-1;i++)
        {
             totaltime += Math.min(timeSeries[i+1]-timeSeries[i],duration);//4-1=3,2=2
        }
        return totaltime+duration;
    }
}