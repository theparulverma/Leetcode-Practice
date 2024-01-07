class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        queen(board,ll,ans,0,n);
        return ans;
    }
    public static void queen(char[][] board,List<String> ll,List<List<String>> ans,int r, int tq){
        if(tq==0){//means all the queens jo hai voh placed ho gayi hai board mein
            ans.add(new ArrayList<String>(ll));
            return;

        }
        for(int c =0;c<board.length;c++){
            if(isitsafe(board,r,c)){
                board[r][c] = 'Q';
                ll.add(new String(board[r]));//jo voh row ban kar aayegi usse copy karlege as string
                queen(board,ll,ans,r+1,tq-1);
                //ll.add(".");
                board[r][c]='.';//backtrack
                //ll.add(".");
                ll.remove(ll.size()-1);
                
            }
        }
    }
    public static boolean isitsafe(char [][] board,int row, int col){
        //yeh vala loop uss row/column mein check karne ke liye
        int r=row;
        while(r>= 0){
            if(board[r][col]=='Q'){//it means uss jagah pe already queen sitted hai aur vaise hum true false se check kar rahe hai but in this we are checking by "Q" soo we check as board[r][c]="Q";
                return false;
            }
            r--;
        }//left diagnol mein check karne ke liye
        r= row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }//right diagnol mein check karne ke liye
        r=row;
        c=col;
        while(r >= 0 && c< board.length){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
   
}