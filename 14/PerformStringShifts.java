class PerformStringShifts {
    
    public String stringShift(String s, int[][] shift) {
        int N = s.length();
        int i = 0;
        
        for (int[] sh : shift)
            i += (sh[0] == 0) ? sh[1] : -sh[1];
        
        i = (i % N + N) % N;
        
        return s.substring(i) + s.substring(0, i);
    }
    
}
