/*
 * @lc app=leetcode.cn id=27 lang=cpp
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
       int count=0;             //记录数组中有效元素个数
       for(int i=0;i<nums.size();i++){
           if(nums[i]!=val){
               nums[count++]=nums[i];  //记录数组中有效元素个数
           }
       }
       return count;
    }
};
// @lc code=end

