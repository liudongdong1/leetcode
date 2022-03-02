/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    //方式：使用栈进行操作
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character>stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            Character temp=s.charAt(i);
            if(stack.size()>0&&stack.peek()==temp) {
                stack.pop();
            }else{
                stack.push(temp);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();

    }
}
// @lc code=end

