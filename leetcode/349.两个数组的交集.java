/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer>result=new HashMap<Integer, Integer>();
        HashMap<Integer, Integer>table=new HashMap<Integer, Integer>();
        for(int i=0;i<nums1.length;i++) {
            if(!table.containsKey(nums1[i])){
                table.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(table.containsKey(nums2[i])){
                // 注意contains value 和containsKey 用法
                if(!result.containsValue(nums2[i])){
                    result.put(result.size(),nums2[i]);
                }
            }
        }
        int[] d = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            d[i] = result.get(i);
        }
        return d;
    }
}
// @lc code=end

