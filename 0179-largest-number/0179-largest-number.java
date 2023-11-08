class Solution {
    public String largestNumber(int[] nums) {
       int n = nums.length;
        String[] s = new String[n];//yeh  array banaya hai humne jismein string value li hai
        for(int i =0;i<n;i++){
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));//yeh function h jismein hum sort karte h string ko decreasing order mein
        StringBuilder sb = new StringBuilder();
        for(String str:s){
            sb.append(str);//hum stringbuilder function isliye banate hai kyuki yeh easy hota hai ismein kuch bhi add karna and and it can be further converted into normal string
        }
        String result = sb.toString();
        result = result.startsWith("0")?"0":result;
            return result;
    }
    
}