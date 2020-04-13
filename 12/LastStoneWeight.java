class LastStoneWeight {
    
    public int lastStoneWeight(int[] stones) {
        while (true) {
            int heaviest = 0, secondHeaviest = 0;
            int i = -1, j = -1;           
            
            for (int k = 0; k < stones.length; k++) {
                if (stones[k] > heaviest) {
                    secondHeaviest = heaviest;
                    heaviest = stones[k];
                    j = i;
                    i = k;
                } else if (stones[k] > secondHeaviest) {
                    secondHeaviest = stones[k];
                    j = k;
                }
            }
            
            if (secondHeaviest == 0)
                return heaviest;
            
            stones[i] = (heaviest == secondHeaviest) ? 0 : stones[i] - stones[j];
            stones[j] = 0;
        }
    }
    
}
