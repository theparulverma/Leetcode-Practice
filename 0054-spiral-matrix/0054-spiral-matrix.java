class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int topRow=0,bottomRow=r-1,leftColumn=0,rightColumn=c-1;
        int total=0;
        List<Integer> ans = new ArrayList<Integer>();
        while (total<r*c){

//            topRow=left to right col
            for(int j=leftColumn;j<=rightColumn && total<r*c;j++){
                ans.add(matrix[topRow][j]);
                // System.out.print(matrix[topRow][j] + " ");
                total++;
            }
            topRow++;
//            rightCol=top to bottom row
            for(int i=topRow;i<=bottomRow && total<r*c;i++){
               ans.add(matrix[i][rightColumn]);
                // System.out.print(matrix[i][rightColumn] + " ");
                total++;
            }
            rightColumn--;
//            bottomRow=right to left col
            for(int j=rightColumn;j>=leftColumn && total<r*c;j--){
                ans.add(matrix[bottomRow][j]);
                // System.out.print(matrix[bottomRow][j] + " ");
                total++;
            }
            bottomRow--;
//            leftCol=bottom to top row
            for(int i=bottomRow;i>=topRow && total<r*c;i--){
               ans.add(matrix[i][leftColumn]);
                // System.out.print(matrix[i][leftColumn] + " ");
                total++;
            }
            leftColumn++;

        }
        return ans;
    }
}