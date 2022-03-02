/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int maxValue=nums[0],fx=nums[0];
        for(int i=1;i<nums.length;i++){
            fx=Math.max(fx+nums[i],nums[i]);
            maxValue=Math.max(fx,maxValue);
        }
        return maxValue;

    }

    public int maxSubArrayV2(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int maxValue=nums[0];
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=i;j<nums.length;j++){
                temp+=nums[j];
                maxValue=Math.max(maxValue,temp);
            }
        }
        return maxValue;

    }
}
// @lc code=end

