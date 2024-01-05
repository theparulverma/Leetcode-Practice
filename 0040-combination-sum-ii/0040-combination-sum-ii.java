class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates, target, ll, ans, 0);
        return ans;
    }
    public static void combination(int[] coin, int target, List<Integer> ll, List<List<Integer>> ans, int idx){
        if(target ==0){
            ans.add(new ArrayList<Integer>(ll));
            return;
        }
        for(int i =idx;i<coin.length;i++){
            if(i>idx && coin[i] == coin[i-1]){//to avoid duplicates
                continue;
            }
            if(target >= coin[i]){
                ll.add(coin[i]);
                combination(coin,target-coin[i],ll,ans,i+1);
                ll.remove(ll.size()-1);
            }
        }
        
    }
}