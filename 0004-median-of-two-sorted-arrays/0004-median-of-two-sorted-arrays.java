class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //time complex
        /*int m = nums1.length;
        int n = nums2.length;
        int low =0;
        int high = m+n;
        while(low<=high){
            int mid = (high+low)/2;
            int 
            
        }
         
    }
        /*public static int[] mergeArrays(int[] arr1, int[] arr2) {
    int len1 = arr1.length;
    int len2 = arr2.length;
    int[] merged = new int[len1 + len2];
    
    int i = 0; 
    int j = 0; 
    int k = 0;
    while (i < len1 && j < len2) {
        if (arr1[i] <= arr2[j]) {
            merged[k] = arr1[i];
            i++;
        } else {
            merged[k] = arr2[j];
            j++;
        }
        k++;
    }
    while (i < len1) {
        merged[k] = arr1[i];
        i++;
        k++;
    }
    while (j < len2) {
        merged[k] = arr2[j];
        j++;
        k++;
    }
    return merged;
    }*/
    int m = nums1.length;//2
        int n = nums2.length;//1

        // Ensure that nums1 is the smaller array
        if (m > n) {//2>1
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }

        int imin = 0, imax = m, halfLen = (m + n + 1) / 2;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = halfLen - i;

            if (i < m && nums2[j - 1] > nums1[i]) {
                imin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                imax = i - 1;
            } else {
                int maxLeft;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }

        return 0.0; 
    }
}