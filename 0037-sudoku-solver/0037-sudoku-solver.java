class Solution {
    public void solveSudoku(char[][] board) {
      solve(board,0,0);  
    }
    public boolean solve(char[][] grid,int cr,int cc){
        //cr means current row
        //cc means current column
        if(cc==9){
            cc=0;
            //solve(grid,cr+1,cc);
            cr++;
        }
        if(cr==9){
           // display(grid);
            return true;
        }
        if(grid[cr][cc]!='.'){//it means already filled h kisi number se
            boolean x=solve(grid,cr,cc+1);
            if(x==true) return true;
        }
        else{
            for(char val='1';val <='9';val++){
               if(isitsafe(grid,cr,cc,val)){
                   grid[cr][cc]=val;
                   boolean y =solve(grid,cr,cc+1);
                   if(y == true) return true;
                   grid[cr][cc]='.';
               } 
            }
        }
        return false;
    }
    public boolean isitsafe(char[][] grid,int cr,int cc,char val){
        for(int i=0;i<9;i++){
            if(grid[cr][i]==val)//it means column wise check karege ki voh value uss column mein pehle se toh nhi nhai,hai toh return false kara do
            return false;
        }
        for(int i=0;i<9;i++){
            if(grid[i][cc]==val)
                return false;
        }
        int r=cr - cr % 3;
        int c=cc - cc % 3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(grid[i][j]==val)
                    return false;
            }
        }
        return true;
    }
}
    /*public void display(char[][] grid){
               for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid.length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
    }
    }
}*/
