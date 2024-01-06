class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(word.charAt(0) == board[i][j]){
                    boolean ans = wordsearch(board,i,j,word,0);
                    if(ans == true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean wordsearch(char[][] maze, int cr, int cc, String word, int idx){
        if(idx == word.length()){
            return true;
        }
        if(cr < 0 || cc <0 || cr >= maze.length || cc >= maze[0].length || word.charAt(idx) != maze[cr][cc]){
            return false;
        }
        //blocked
        maze[cr][cc] = '*';
        int[] r ={-1,1,0,0};
        int[] c ={0,0,-1,1};
        for(int i =0;i<c.length;i++){
            boolean ans = wordsearch(maze,cr+r[i],cc+c[i],word,idx+1);
            if(ans){
                return true;
            }
        }
        //undo
        maze[cr][cc] = word.charAt(idx);
        return false;
    }
}