/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <=1){
            return false;
        }
        HashSet<Integer> map = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }
}
// @lc code=end

