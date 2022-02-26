/*
 * @lc app=leetcode.cn id=35 lang=cpp
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int left=0,right=nums.size()-1;
        int position=nums.size();    //如果数组中没有该元素
        while(left <= right) {
            int mid=((right-left)>>1) + left;
            if(target <=nums[mid]){
                position=mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return position;
    }
};
// @lc code=end

