/*class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count =0;
        for(int i = 0;i<nums.length;i++){
              String one = nums[i];//means voh pehla index vala string aa gaya
            for(int j =0;i<target.length();j++){
                if((one+target.substring(j)).equals(target)){
                    count++;
                }
            }
        }
        return count;
    }
}*/
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && (nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }
}
