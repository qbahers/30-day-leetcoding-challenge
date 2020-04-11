class MinStack {
    
    Deque<Integer> stack;
    Deque<Integer> min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<Integer>();
        min = new LinkedList<Integer>();
        min.addFirst(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        stack.addFirst(x);
        
        if (x <= min.peekFirst()) {
            min.addFirst(x);
        }
    }
    
    public void pop() {
        int x = stack.removeFirst();
        
        if (x == min.peekFirst()) {
            min.removeFirst();
        }
    }
    
    public int top() {
        return stack.peekFirst();
    }
    
    public int getMin() {
        return min.peekFirst();
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
