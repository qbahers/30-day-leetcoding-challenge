/**
 * Time:  O(m + n)
 * Space: O(1)
 */

class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        
        do {
            i = previous(S, i);
            j = previous(T, j);

            if (i < 0 && j < 0)
                return true;
            
            if (i < 0 || j < 0)
                return false;
        } while (S.charAt(i--) == T.charAt(j--));
        
        return false;
    }
    
    private int previous(String s, int i) {
        int count = 0;
        
        while (i >= 0 && (s.charAt(i) == '#' || count > 0)) {
            if (s.charAt(i) == '#')
                count++;
            else
                count--;

            i--;
        }
        
        return i;
    }

}
