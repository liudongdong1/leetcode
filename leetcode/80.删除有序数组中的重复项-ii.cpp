/*
 * @lc app=leetcode.cn id=80 lang=cpp
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() <2){
            return nums.size();
        }
        int index=2;
        for(int i=2;i<nums.size();i++){
            if(nums[i]!=nums[index-2]){   //这里是允许俩个元素相等
                nums[index++]=nums[i];
            }
        }
        return index;
    }
};
// @lc code=end

