class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        generate(n,0,0,"",ll);
        return ll;
    }
    public void generate(int n, int open,int close,String ans,List<String> ll){
        if(open==n && close == n){
            ll.add(ans);
            return;
        }
        if(open<n){
            generate(n,open+1,close,ans+"(",ll);
        }
        if(open>close){
            generate(n,open,close+1,ans+")",ll);
        }
    }
}