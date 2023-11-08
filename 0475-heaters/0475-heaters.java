class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i =0;
        int radius =0;
        int left;
        int right;
        for(int house: houses){
            while(i < heaters.length-1 && heaters[i] <= house){//this loop is to find the closest heaters near house
                i++;
            }
            left = Math.abs(house-(i>0 ? heaters[i-1] : heaters[0]));//left heater se distance kitni h house ki distance means radius
            right = Math.abs(heaters[i] - house);
        radius = Math.max(radius,Math.min(left,right));
        }
        return radius;
    }
}