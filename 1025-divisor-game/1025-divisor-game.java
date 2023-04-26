class Solution {
    public boolean divisorGame(int n) {
        //alice ke pass moves hone chaiye last tak like n=3 toh first move alice then bob aur phir alice ke pass baacha hi nhi soo it lose alice always win with even means 0,2 aaisa
        if(n%2==0)return true;
        return false;
    }
}