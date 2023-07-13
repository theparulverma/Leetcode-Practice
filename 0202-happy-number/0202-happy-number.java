class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        
        while (n != 1) {
            n = Square(n);
            
            if (visited.contains(n)) {
                return false;
            }
            
            visited.add(n);
        }
        
        return true;
    } 
    private static int Square(int n) {
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        
        return sum;
    }
}
        /*public static int square(int n){
            int no;
            int r;
            int s=0;
            while(n!=0)
            {
                r=n%10;
                s=s+r*r;
                n=n/10;
            }
            return s;
        }
}*/