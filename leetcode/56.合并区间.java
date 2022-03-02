/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0){   //输入数据检查习惯
            return new int[0][2];
        }
        Arrays.sort(intervals,new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2){
                return interval1[0]-interval2[0];
            }
        });
        List<int[]> merge = new ArrayList<int[]>();
        for(int i=0;i<intervals.length;i++){
            int L=intervals[i][0];
            int R=intervals[i][1];
            if(merge.size()==0||merge.get(merge.size()-1)[1]<L){
                merge.add(new int[]{L,R});
            }else{
                merge.get(merge.size()-1)[1]=Math.max(R,merge.get(merge.size()-1)[1]);
            }
        }
        return merge.toArray(new int[merge.size()][]);  //array 数组到二维数组的变化
    }
}
// @lc code=end

