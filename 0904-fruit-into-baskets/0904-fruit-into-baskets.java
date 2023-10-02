class Solution {
    public int totalFruit(int[] fruits) {
     //rules 2 basket are there for counting ehich type of fruit is that
        //means one fruit at a time tum aapni basket mein daal sakte ho
        HashMap<Integer,Integer> basket = new HashMap<>();//iss basket hashmap mein fruit type aur uska count
        int left=0;
        int right=0;
        int max=0;//this is for ki hume kitne total fruits collect kare maximum of 2 different types
        for(right=0;right<fruits.length;right++){//this is the right pointer for accessing the fruit array upto last tak
            int currentcount = basket.getOrDefault(fruits[right],0);//it returns the value associated with specified key and         
            basket.put(fruits[right],currentcount+1);//and increase kar raha h count ko 
            while(basket.size()>2){//means basket ke pass 2 se jada type ke fruits aa gayye
                int fruitcount=basket.get(fruits[left]);//means hum check karege fruit ka count means 1 type ke fruit 3 hai
                if(fruitcount == 1)// means jo fruit hai uska sirf count  ek hi toh
                    basket.remove(fruits[left]);
                    else 
                        basket.put(fruits[left],fruitcount-1);
                    left++;
                    
                }
                max = Math.max(max,right-left+1);
        }
        return max;
    }
}