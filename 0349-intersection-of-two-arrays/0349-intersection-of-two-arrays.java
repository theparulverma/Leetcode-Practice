/*class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2= nums2.length;
        int i =0; 
        int j =0;
        int k =0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i< len1 && j< len2)
        {
            if(nums1[i]< nums2[j])
            {
                i++;
            }
            else if(nums1[i]> nums2[j])
            {
                j++;
            }
            else
            {
                nums1[k++]= nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
        
    }
}*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}