/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] array=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<array.length;i++){
            result.append(" "+new StringBuilder(array[i]).reverse().toString());
        }
        result.delete(0,1);
        return result.toString();
    }
}
// @lc code=end

