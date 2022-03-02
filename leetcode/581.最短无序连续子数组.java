/*
 * @lc app=leetcode.cn id=581 lang=java
 *
 * [581] 最短无序连续子数组
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int i=0,j=nums.length-1;
        for(;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                break;
            }
        }
        for(;j>=1;j--){
            if(nums[j]<nums[j-1]||nums[j]<nums[i]){
                break;
            }
        }
        return j-i+1>0?j-i+1:0;
    }
}
// @lc code=end

