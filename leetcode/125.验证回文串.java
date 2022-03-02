/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==1){
            return true;
        }
        int i=0,j=s.length()-1;
        String lowerCase=s.toLowerCase();
        while(i<j){
            //在与的条件 先后依赖问题卡住了半天
            while(i<s.length()&&!Character.isLetterOrDigit(lowerCase.charAt(i))){ 
                i++;
            }
            while(j>=0&&!Character.isLetterOrDigit(lowerCase.charAt(j))){  
                j--;
            }
            if(j<=i){
                break;
            }
            if(i<j&&lowerCase.charAt(i)!=lowerCase.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
   
}
// @lc code=end

