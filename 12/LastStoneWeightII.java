/**
 * Time:  O(n log(n))
 * Space: O(n)
 */

class LastStoneWeightII {
    
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int stone : stones)
            pq.add(stone);
        
        while (pq.size() > 1)
            pq.add(pq.poll() - pq.poll());
        
        return pq.poll();
    }
    
}
