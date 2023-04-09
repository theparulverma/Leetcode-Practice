class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int j = arr.length*5/100;
        double sum=0;
        for(int i =j;i<arr.length-j;i++)
        {
            sum += arr[i];
        }
        return sum/ (arr.length-2*j);
    }
}