class MinStack {

    private List<Integer> stack;
    private List<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
        
    }
    
    public void push(int val) {
        stack.add(val);

        // keep track of the min element
        if(minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)){
            minStack.add(val);
        } else {
            minStack.add(minStack.get(minStack.size() - 1));
        }
        
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.remove(stack.size() - 1);
            minStack.remove(minStack.size() - 1);
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
        
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
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