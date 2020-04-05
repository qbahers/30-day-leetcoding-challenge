/**
 * Time:  O(n)
 * Space: O(1)
 */

class MoveZeroes {
    
    public void moveZeroes(int[] nums) {
        int i = 0;
        
        for (int j = 0; j < nums.length; j++)
            if (nums[j] != 0) {
                if (j > i) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
            }
    }
    
}
