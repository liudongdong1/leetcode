/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
    //方法： 使用俩个栈来进行模拟， 栈：先进后出， 队列：先进去先出来
    Deque<Integer>instack;
    Deque<Integer>outstack;
    public MyQueue() {
        instack = new LinkedList<Integer>();
        outstack = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        instack.push(x);
    }
    
    public int pop() {
        if(outstack.isEmpty()){
            inToout();
        }
        return outstack.pop();
    }
    
    public int peek() {
        if(outstack.isEmpty()){
            inToout();
        }
        return outstack.peek();
    }
    public void inToout(){
        while(!instack.isEmpty()){
            outstack.push(instack.pop());
        }
    }
    
    public boolean empty() {
        return instack.isEmpty()&&outstack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

