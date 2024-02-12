class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map= new HashMap<>();
      for(int i =0;i<nums.length;i++){//for calculating occurence of each element in array like 1-3,2-2,3-1.
          int freq = map.getOrDefault(nums[i],0)+1;
          map.put(nums[i],freq);
      }
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));//pair type ki priority queue
        Set<Integer> keys = map.keySet();//voh jo priority queue mein pair add karne ke liye(3,1),(2,2)
        for(int key:keys){
          pq.add(new Pair(map.get(key),key));
            if(pq.size()>k){
                pq.poll();
            }
        }
         int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll().getValue();
        }

        return res;
    }
}