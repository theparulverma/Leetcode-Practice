class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n =mat[0].length;
        for(int col =0;col<n;col++){
            sort(mat,0,col,m,n);//yeh loop hai hmara first row mein traverse ke liye
        }
        for(int row = 1;row<m;row++){
            sort(mat,row,0,m,n);
        }
        return mat;
    }
    void sort(int[][] mat,int row,int col,int m,int n){
        List<Integer> values = new ArrayList<>();
        int r = row;
        int c = col;
        while(r<m && c<n){
            values.add(mat[r][c]);//pehle uss list mein saari value add kar lenge 
            r++;
            c++;
        }
        Collections.sort(values);//uske baad sort
        r=row;
        c=col;
        int ind=0;
        while(r<m && c<n){
            mat[r][c]=values.get(ind++);//then uusi mat matrix mein sorted value ko place kar denge
            r++;
            c++;
        }
    }
        
}