class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combine(k,n,1,ll,ans);
        return ans;
    }
    public void combine(int k,int target,int start,List<Integer> ll,List<List<Integer>> ans){
        if(k==0 && target==0){
         ans.add(new ArrayList<>(ll));
     } 
        for(int i =start;i<=9;i++){
            if(i<=target){
                  ll.add(i);
                  combine(k-1,target-i,i+1,ll,ans);
                ll.remove(ll.size()-1);
            }
          
            //if()
        }
        
    }
 
}