/*
 * @lc app=leetcode.cn id=1 lang=cpp
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int>mapping;
        vector<int> result;
        for(int i = 0; i < nums.size();i++){
            mapping[nums[i]]=i;
        }
        for(int i=0;i<nums.size();i++){
            int temp=target-nums[i];
            if(mapping.find(temp)!=mapping.end()&&mapping[temp]>i){
                result.push_back(i);
                result.push_back(mapping[temp]);
                return result;
            }
        }
        return result;
    }
};
// @lc code=end

