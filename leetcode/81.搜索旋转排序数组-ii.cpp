/*
 * @lc app=leetcode.cn id=81 lang=cpp
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
public:
    bool search(vector<int>& nums, int target) {
        int first=0,last=nums.size();
        while(first<last) {
            int mid=(first+last)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[first]<nums[mid]){
                if(nums[first]<=target&&nums[mid]>target) {
                    last=mid;
                }else{
                    first=mid+1;
                }
            }else if(nums[first]>nums[mid]){
                if(nums[mid]<target&&nums[last-1]>=target){  //这里是last-1
                    first=mid+1;
                }else{
                    last=mid;
                }
            }else{
                first=first+1;
            }
        }
        return false;
    }
};
// @lc code=end

