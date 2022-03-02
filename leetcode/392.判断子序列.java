/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()){
            return false;
        }
        if(s.length()<1){   //这里需要对空字符串进行处理
            return true;
        }
        int step=0;
        for(int i=0;i<t.length();i++){
            
            if(s.charAt(step)==t.charAt(i)){
                step++;
            }
            if(step==s.length()){   //判断相等的条件
                return true;
            }
        }
        
        return false;

    }
}
// @lc code=end

