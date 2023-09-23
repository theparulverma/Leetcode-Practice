class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) res.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot) res.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot) res.add(nums[i]);
        }
        int answer[]=new int[nums.length];
        for(int i=0;i<res.size();i++){
            answer[i]=res.get(i);
        }
        return answer;
    }
}