/*
 * @lc app=leetcode.cn id=452 lang=java
 *
 * [452] 用最少数量的箭引爆气球
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0){
            return 0;
        }
        Arrays.sort(points,new Comparator<int[]>() {
            public int compare(int[]a, int b[]){
                if(a[1]<b[1]){
                    return -1;
                }else if(a[1]>b[1]){
                    return 1;
                }
                return 0;
            }
        });
        int n=points.length;
        int count=1;
        int R=points[0][1];
        for(int i=0;i<n;i++){
            if(points[i][0]>R){      //这里如果边界相等，算重叠了
                count++;
                R=points[i][1];
            }
        }
        return count;
    }
}
// @lc code=end

