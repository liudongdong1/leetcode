/*
 * @lc app=leetcode.cn id=1024 lang=java
 *
 * [1024] 视频拼接
 */

// @lc code=start
class Solution {
    public int videoStitching(int[][] clips, int time) {
        int[] maxn=new int[time];
        int step=0,last=0,pre=0;
        for(int i=0;i<clips.length;i++){
            if(clips[i][0]<time){
                maxn[clips[i][0]]=Math.max(maxn[clips[i][0]],clips[i][1]);   
            }
        }
        for(int i=0;i<time;i++){
            if(i==last){
                return -1;
            }
            if(i==pre){   //进行新的一个区间
                step++;
                pre=last;
            }
            last=Math.max(last,maxn[i]);
            
        }
        return step;
    }
}
// @lc code=end

