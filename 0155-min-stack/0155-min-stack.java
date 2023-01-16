class MinStack {
    private int min=Integer.MAX_VALUE;
    ArrayList<Integer> stack;
    public MinStack() {
        stack=new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if (val < min) min = val;
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        min=Integer.MAX_VALUE;
        for (var i : stack) {
            if (i < min) {
                min = i;
            }
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */