/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {   //todo 
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }
    //质数判断
    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {  //判断的条件
            if (x % i == 0) {   //如果能被数取余，则不是质数
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

