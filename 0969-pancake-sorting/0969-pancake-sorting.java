class Solution {
    public List<Integer> pancakeSort(int[] arr) {
      ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.length-1;i>0;--i){
            for(int j = 1;j<=i;++j){
                if(arr[j] == i+1){
                    replace(arr,j);
                    ans.add(j+1);
                    break;
                }
            }
            replace(arr,i);
            ans.add(i+1);            
        }
        return ans;
    }
    
    private void replace(int[] arr, int end){
        int start =0;
        while(start<= end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
   }
}