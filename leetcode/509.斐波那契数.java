/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int p=1,q=1,sum=0;
        for(int i=2;i<n;i++){
            sum=p+q;
            p=q;
            q=sum;
        }
        return sum;
    }
}
// @lc code=end

