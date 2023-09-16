/*class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int sumA=0;
    int sumB=0;
    int candy=0;
    {
        sumA += candy;
    }
    HashSet<Integer> set = new HashSet();
    {
        set.add(candy);
        sumB += candy;
    }
    int delta = (sumB - sumA)/2;
    {
        if(set.contains(candy+delta))
        {
            return new int[]{candy,candy+delta};
        }
    }
    return null;
        
    }
}*/
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        // Calculate the sums of candy sizes for Alice and Bob
        for (int size : aliceSizes) {
            sumA += size;
        }
        
        for (int size : bobSizes) {
            sumB += size;
            set.add(size); // Populate the HashSet with Bob's candy sizes
        }
        
        int delta = (sumB - sumA) / 2;
        
        // Check if there exists a candy size in Bob's set such that swapping makes the sums equal
        for (int size : aliceSizes) {
            if (set.contains(size + delta)) {
                return new int[]{size, size + delta};
            }
        }
        
        // If no valid swap is found, return an empty array
        return new int[0];
    }
}