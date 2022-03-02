/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {

    Deque<Integer>stack1;
    Deque<Integer>minstack;
    public MinStack() {
        stack1=new LinkedList<Integer>();
        minstack=new LinkedList<Integer>();
        minstack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack1.push(val);   //是push不是add
        minstack.push(Math.min(minstack.peek(),val));
    }
    
    public void pop() {
        stack1.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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
// @lc code=end

