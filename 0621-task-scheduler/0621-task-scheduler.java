class Solution {
    public int leastInterval(char[] tasks, int n) {
        //in this 2 tasks ek saath mein nhi aa sakte means agar ek a hai phir uske baad n ka space lega acc to this example n= 2 means ek a ke baad aagle 2 space mein same nhi aana chaiye toh a ke baad b phir b nhi likh sakte toh isliye 1 idle time aaise hi idle time calculate karna h
       /* int out =0;
        for(int i =0;i<tasks.length;i++){
            for(int j=i+1;j<tasks.length-1;j++){
                if(tasks[i]==tasks[j]){
                    out += n;
                }
            }
        }
        return out;*/
        int[] freq = new int[26];
        for(char c : tasks){
            freq[c - 'A']++;//to calculate frequency of each character
        }
        Arrays.sort(freq);
        int maxfreq = freq[25];//maximum frequency
        int idle = (maxfreq-1)*n;
        for(int i = 24;i >= 0 && freq[i]>0;i--){
            idle -= Math.min(maxfreq-1,freq[i]);
        }
        idle = Math.max(0,idle);
        return tasks.length+idle;//yeh unit of time jo cpu ko lagega tasks finish karne mein
        
    }
}