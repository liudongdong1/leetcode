/*
 * @lc app=leetcode.cn id=1287 lang=java
 *
 * [1287] 有序数组中出现次数超过25%的元素
 */

// @lc code=start
class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=(int)arr.length/4;
        int result=-1;
        for(int i=0;i<arr.length-count;i++){
            if(arr[i]==arr[count+i]){
                result=arr[i];
            }
        }
        return result;
    }
}
// @lc code=end

