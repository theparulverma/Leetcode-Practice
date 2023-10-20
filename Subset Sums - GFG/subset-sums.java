//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
/*class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr.size();
        int sum =0;
        if(len==0){
            return 0;
        }
        for(int i =0;i<len;i++){
            list.add(sum);
        }
        return list;
    }
}*/
class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr.size();
        int sum = 0;

        for (int i = 0; i < (1 << len); i++) {
            sum = 0;
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) > 0) {
                    sum += arr.get(j);
                }
            }
            list.add(sum);
        }

        return list;
    }
}
