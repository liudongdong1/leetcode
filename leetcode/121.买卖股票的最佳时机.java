/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
   //方法一：暴力解决
   //方法二： 记录最低的数值，始终与最低的数值进行比较

    public int maxProfit(int[] prices) {
        int MinValue=Integer.MAX_VALUE;
        int MaxValue=0;
        for(int i=0;i<prices.length;i++){
            if(MinValue>prices[i]){
                MinValue=prices[i];
            }
            if(prices[i]-MinValue>MaxValue){
                MaxValue=prices[i]-MinValue;
            }
        }
        return MaxValue;
    }
}
// @lc code=end

