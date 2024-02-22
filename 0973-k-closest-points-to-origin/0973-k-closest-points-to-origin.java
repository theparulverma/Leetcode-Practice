       /* int [][] origin =[0][0];
        for(int i =0;i<points.length;i++){
            int pointa[][] = points[i];
            int dist = Math.sqrt()
        }
        int point[]= new point[new Comparator];
        {
            @override
            public int compare(point[i],point[i+1]){
                return o1.val - o2.val;
                return 0;
            }
        }*/
class Solution {
    public class Pair implements Comparable<Pair>{
        double dis =0;
        int x =0;
        int y =0;//we have made pair class for storing the value of array point in x and y as we want as a whole value of x and y [1,3]
        public Pair(double dis,int x,int y){//constructor for storing the pointers value
            this.dis=dis;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Pair p){//it is a comparator function
            return (int)p.dis-(int)this.dis;//it means to cmpare the current pair value to the previous pair value this 
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();//priorityqueue is pq  and pair is p array 
        for(int i =0;i<points.length;i++){
            int p[] = points[i];
            double dis =((p[0]*p[0])+(p[1]*p[1]));//dis is the distance from the origin hum sabke distance nikalege and compare karege 
            pq.add(new Pair(dis,p[0],p[1]));//priority queue mein add kiya voh jo distance hai means and p[0] ki value and p[1] ki
        }
        while(pq.size() > k){
            pq.poll();
        }
    
    int ans[][] = new int[pq.size()][2];//hume 2 isliye liya hai kyuki 1 pair ki 2 values hainaa x and y axis ki
    int i =0;
    while(!pq.isEmpty()){
        Pair pr = pq.poll();
        ans[i][0]=pr.x;
        ans[i][1]=pr.y;
        i++;
    }
        return ans;
    }
}