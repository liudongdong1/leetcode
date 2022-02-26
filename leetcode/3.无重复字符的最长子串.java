/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int left=0,max=0;
        HashMap<Character,Integer>chartable=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();++i){
            if(chartable.containsKey(s.charAt(i))){
                left=Math.max(left,chartable.get(s.charAt(i))+1);
            }
            chartable.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
// @lc code=end

