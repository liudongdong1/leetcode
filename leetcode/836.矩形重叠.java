/*
 * @lc app=leetcode.cn id=836 lang=java
 *
 * [836] 矩形重叠
 */

// @lc code=start
class Solution {
    //方法一： 判断点是否在区间内
    //方法二： 投影到x轴，轴的边是否都相交
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return Math.max(rec1[0],rec2[0])<Math.min(rec1[2],rec2[2])&&Math.max(rec1[1],rec2[1])<Math.min(rec1[3],rec2[3]);
    }
}
// @lc code=end

