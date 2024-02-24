/*class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] prefsum= new int[r+1][c+1];
        int out =0;
        if(threshold == 0 || threshold ==1){
            return 0;
        }
        for(int i =1;i<r;i++){
            for(int j =1;j<c;j++){
                prefsum[i][j] = mat[i][j-1]+mat[i-1][j]-mat[i-1][j-1]+prefsum[i][j];//we are calculating sum of prefsum (1,1) in first iteration and as follows 
            }
        }
     int l =0;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                
                 while (i + l <= r && j + l <= c &&
                      (prefsum[i+l][j+l]-prefsum[i+l][j]-prefsum[i][j+l]+prefsum[i][j] <= threshold)) {
                     l++;
                    out=l;
                }
            }
        }
        return out;
    } 
}*/

/*class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int out =0;
        int r = mat.length;
        int c = mat[0].length;
        int[][] sum =  new int[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(i==0 && j==0){
                    sum[i][j]=mat[i][j];
                }
                else if(i==0){
                    sum[i][j]=sum[i][j-1]+mat[i][j];
                }
                else if(j==0){
                    sum[i][j]=sum[i-1][j]+mat[i][j];
                }
                else{
                    sum[i][j]=sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+mat[i][j];
                }
            }
        }
        /*int l=0;
        for(int i =0;i<r-1;i++){
            for(int j =0;j<c-1;j++){
                while(i+l <= r && j+l <=c && sum[i+l][j+l]-sum[i+l][j]-sum[i][j+l]+sum[i][j]<= threshold){
                    l++;
                    out=l;
                }
            }
        }
        return out;
       // int out =0;
        int i=1;
        int j=1;
        int low = mat[0][0];
        int high = mat[r-1][c-1];
        while(low<high){
            int mid = low+high/2;
            if(sum[i+1][j+1]<= threshold){
                i++;
                j++;
                out = sum[i][j];
            }
            else if(sum[i][j]> threshold){
                low = mid -1;
                i++; 
                j++;
            }
            else {
                high = mid+1;
            }
        }
        return out;
    }
}
*/

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] v = new int[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    v[i][j] = mat[i][j];
                } else if (i == 0) {
                    v[i][j] = v[i][j - 1] + mat[i][j];
                } else if (j == 0) {
                    v[i][j] = v[i - 1][j] + mat[i][j];
                } else {
                    v[i][j] = (v[i - 1][j] + v[i][j - 1]) - v[i - 1][j - 1] + mat[i][j];
                }
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

        int l = 1;
        int r = Math.min(n, m);

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (chk(mid, v, threshold)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
        public boolean chk(int mid, int[][] mat, int threshold) {
        int n = mat.length;
        int m = mat[0].length;
        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i - mid) >= 0 && (j - mid) >= 0) {
                    int cal = (mat[i][j] - (mat[i - mid][j] + mat[i][j - mid])) + mat[i - mid][j - mid];
                    mn = Math.min(cal, mn);
                }
                if ((i - mid) == -1 && (j - mid) == -1) {
                    int cal = mat[i][j];
                    mn = Math.min(cal, mn);
                } else if ((i - mid) == -1 && (j - mid) >= 0) {
                    int cal = (mat[i][j] - (mat[i][j - mid]));
                    mn = Math.min(cal, mn);
                } else if ((j - mid) == -1 && (i - mid) >= 0) {
                    int cal = (mat[i][j] - (mat[i - mid][j]));
                    mn = Math.min(cal, mn);
                }
            }
        }

        return mn <= threshold;
    }
}
