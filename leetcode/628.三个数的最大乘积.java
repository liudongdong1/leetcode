/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */

// @lc code=start
class Solution {
    // 方法： 先进行排序，然后在处理
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        return Math.max(nums[0]*nums[1]*nums[n],nums[n]*nums[n-1]*nums[n-2]);
    }
}
// @lc code=end

