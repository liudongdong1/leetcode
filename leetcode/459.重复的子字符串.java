/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引
        return (s+s).indexOf(s,1)!=s.length();  
    }   
}
// @lc code=end

