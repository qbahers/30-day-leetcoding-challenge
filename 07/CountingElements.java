/**
 * Time:  O(n)
 * Space: O(n)
 */

class CountingElements {
    
    public int countElements(int[] arr) {
        int res = 0;
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        
        for (int e : arr)
            if (set.contains(e + 1))
                res++;
        
        return res;
    }
    
}
