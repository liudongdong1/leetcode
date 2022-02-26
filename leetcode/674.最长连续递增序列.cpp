/*
 * @lc app=leetcode.cn id=674 lang=cpp
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        int ans=0;
        int n=nums.size();
        int start=0;
        for(int i=0; i<n; i++) {
            if(i>0&&nums[i]<=nums[i-1]){
                start=i;
            }
            ans=max(ans,i-start+1);
        }
        return ans;
    }
};
// @lc code=end

// int findLengthOfLCIS(vector<int>& nums) {
//     int maxlen=0;
//     for(int i=0;i<nums.size()-1; i++){
//         int j=i+1;
//         while(nums[j]>nums[j-1]){
//             j++;
//         }
//         maxlen=(j-i)>maxlen?(j-i):maxlen;
//         i=j-1;
//     }
//     return maxlen;
// }