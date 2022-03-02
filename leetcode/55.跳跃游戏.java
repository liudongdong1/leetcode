/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==0){
            return true;
        }
        int pre=0,last=0;
        for(int i=0;i<nums.length;i++){
            if(last<i){
                return false;
            }
            last=Math.max(last,i+nums[i]);
        }
        return true;
    }
}
// @lc code=end

