/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b) {
                return a[1]-b[1];
            }
        });
        int n=intervals.length;
        int right=intervals[0][1];
        int count=1;
        for(int i=1;i<intervals.length;i++){
            if(right<=intervals[i][0]){
                count++;
                right=intervals[i][1];
            }
        }
        return n-count;
    }
}
// @lc code=end

