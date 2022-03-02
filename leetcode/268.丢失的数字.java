/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 丢失的数字
 */

// @lc code=start
class Solution {
    //方法一： 先排序，排序后数值和下标不相等则退出
    public int missingNumber(int[] nums) {
        int[] table=new int[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            table[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            table[nums[i]]=1;
        }
        int i=0;
        for(;i<table.length;i++){
            if(table[i]==0){
                return i;
            }
        }
        return 0;
    }
}
// @lc code=end

