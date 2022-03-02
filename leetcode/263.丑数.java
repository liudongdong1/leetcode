/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */

// @lc code=start
class Solution {
    //方法： 递归方式
    public boolean isUgly(int n) {
        if(n==1||n==2||n==3||n==5){  //递归正确条件
            return true;
        }
        // 递归错误条件
        if(n<=0){   //因为整数除法，最后均会归为0
            return false;
        }
    
        if(n%2==0){
            return isUgly(n/2);
        }
        if(n%3==0){
            return isUgly(n/3);
        }
        if(n%5==0){
            return isUgly(n/5);
        }
        return false;
        
    }
}
// @lc code=end

