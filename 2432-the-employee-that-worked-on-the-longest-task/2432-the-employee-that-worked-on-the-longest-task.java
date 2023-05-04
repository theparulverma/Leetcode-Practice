class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id=logs[0][0];//means id 00 pe 0 hai toh voh id hai//index
        int longtask=logs[0][1];//humne assume kiya 1st vale ko hi high smajh kar phir hum check karege
        for(int i=1;i<logs.length;i++){//1 se loop isliye start kiya kyuki 1- karna h toh isliye 1 se start kiya
            int workhours=logs[i][1] - logs[i-1][1];
            if(longtask < workhours || longtask == workhours && id > logs[i][0]){
                 id =logs[i][0];//id ko change karne ke liye
                longtask=workhours;
            } 
        }
        return id;//hume index return karna h islie id
    }
}