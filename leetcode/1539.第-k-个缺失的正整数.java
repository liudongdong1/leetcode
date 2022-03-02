/*
 * @lc app=leetcode.cn id=1539 lang=java
 *
 * [1539] 第 k 个缺失的正整数
 */

// @lc code=start
class Solution {
    //用一个变量 \textit{current}current 表示当前应该出现的数，从 11 开始，
    //每次循环都让该变量递增。用一个指针 \textit{ptr}ptr 指向数组中没有匹配的第一个元素，
    //每轮循环中将该元素和 \textit{current}current 进行比较，如果相等，则指针后移，
    //否则指针留在原地不动，说明缺失正整数 \textit{current}current。我们用 \textit{missCount}missCount 变量记录缺失的正整数的个数，每次发现有正整数缺失的时候，该变量自增，并且记录这个缺失的正整数，直到我们找到第 kk 个缺失的正整数。
    public int findKthPositive(int[] arr, int k) {
        int misscount=0,lastMiss=-1,current=1,ptr=0;
        for(;misscount<k;current++){   // todo:  这种循环方式不太好找
            if(current==arr[ptr]){
                ptr=ptr+1<arr.length?ptr+1:arr.length-1;
            }else{
                misscount++;
                lastMiss=current;
            }
        }
        return lastMiss;
    }
}
// @lc code=end

