class Solution {
    public int totalNQueens(int n) {
       boolean[][] board = new boolean[n][n];
       int ans= queen(board,0,n);
        return ans;
    }
    public static int queen(boolean[][] board,int r, int tq){
        int count=0;
        if(tq==0){//means all the queens jo hai voh placed ho gayi hai board mein
           // count++;
            return 1;

        }
        for(int c =0;c<board.length;c++){
            if(isitsafe(board,r,c)){
                board[r][c] = true;
                count += queen(board,r+1,tq-1);
                board[r][c]=false;
            }
        }
        return count;
    }
    public static boolean isitsafe(boolean [][] board,int row, int col){
        //yeh vala loop uss row/column mein check karne ke liye
        int r=row;
        while(r>= 0){
            if(board[r][col]){
                return false;
            }
            r--;
        }//left diagnol mein check karne ke liye
        r= row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }//right diagnol mein check karne ke liye
        r=row;
        c=col;
        while(r >= 0 && c< board.length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}