class HappyNumber {
    
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<Integer>();
        
        while (!visited.contains(n)) {
            if (n == 1)
                return true;
            
            visited.add(n);
            n = sum(n);
        }
        
        return false;
    }
    
    private int sum(int n) {
        int res = 0;
        
        while (n != 0) {
            int digit = n % 10;
            res += digit * digit;
            n /= 10;
        }
        
        return res;
    }
    
}
