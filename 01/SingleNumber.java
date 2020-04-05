/**
 * Time:  O(n)
 * Space: O(1)
 */

class SingleNumber {
    
    public int singleNumber(int[] nums) {
        int res = 0;
        
        for (int num : nums)
            res ^= num;
        
        return res;
    }
    
}
