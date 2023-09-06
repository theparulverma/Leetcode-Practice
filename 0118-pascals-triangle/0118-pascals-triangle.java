class Solution {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res=new ArrayList<List<Integer>>();//means to store the result in arraylist type
        List<Integer>row;
        List<Integer>prev=null;
        for(int i =0;i<numRows;i++){
            row=new ArrayList<Integer>();
            for(int j =0;j <=i;j++)//yeh loop isliye pyramid form mein same row same col ke liye
                if(j==i || j ==0)//means pehla hi item hoga corner vale toh add 1
                    row.add(1);
                    else
                        row.add(prev.get(j-1)+prev.get(j));
                    prev=row;
                    res.add(row);
                }
        return res;
    }
}
