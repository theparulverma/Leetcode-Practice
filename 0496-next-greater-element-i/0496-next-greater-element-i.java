class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer,Integer> hmap= new HashMap<>();
            Stack<Integer> st = new Stack<>();
           // int len =  nums1.length;
            //int[] result= new int[len];
            //Arrays.fill(result,-1);
           for(int i=0;i<nums2.length;i++){
               int num = nums2[i];
               while(!st.isEmpty() && num > st.peek()){
                   hmap.put(st.pop(),num);//means hashmap mein example 1->3 mil gaya next 3->4 ,4->-1,2->-1.as inn dono se next element koi bada nhi hai toh -1 
               }
               st.push(num);
           }
        for(int i =0;i<nums1.length;i++){
            nums1[i]=hmap.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}