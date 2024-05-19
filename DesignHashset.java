// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: I was unsure about why we pushed Integer.MAX_VALUE as the sentennial value only, I tried with -1 on Leetcode, but it started failing. What was the problem when I push -1?

class MinStack {
    Stack<Integer> primary;
    Stack<Integer> minStack;
    int min;

    public MinStack() {
        this.primary = new Stack<>();
        this.minStack = new Stack<>();
        this.min = Integer.MAX_VALUE;
        minStack.push(min);
    }
    
    public void push(int val) {
        primary.push(val);
        if(val <= min){
            min = val;
        }
        minStack.push(min);
    }
    
    public void pop() {
        primary.pop();
        minStack.pop();
        min = minStack.peek();
    }
    
    public int top() {
        return primary.peek();
    }
    
    public int getMin() {
        return min;
    }
}
