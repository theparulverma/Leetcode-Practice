class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length==0 || intervals== null)
            return res.toArray(new int[0][1]);
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);//it means humne list ko array mein convert kiya and then uska a[0][1] wala index return karaya
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i[] : intervals){
        if(i[0]<=end){//means uss interval mein gap toh ho kyuki (0,3)ya (0,0) bhi ho sakta h
            end = Math.max(end,i[1]);
        }
        else{
            res.add(new int[]{start,end});
            start = i[0];
            end = i[1];
        }
    }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][1]);
    }
    
}