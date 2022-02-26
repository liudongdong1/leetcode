/*
 * @lc app=leetcode.cn id=88 lang=cpp
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        //直接合并后排序 sort(nums1.begin(), nums1.end);
        int p1=0,p2=0;
        int sorted[m+n];
        int current=0;
        while(p1<m&&p2<n){
            if(nums1[p1]<nums2[p2]){
                sorted[current++]=nums1[p1++];
            }else{
                 sorted[current++]=nums2[p2++];
            }
        }
        while(p1<m){
            sorted[current++]=nums1[p1++];
        }
        while(p2<n){
            sorted[current++]=nums2[p2++];
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=sorted[i];
        }
    }
};
// @lc code=end

