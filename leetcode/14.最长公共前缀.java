/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    //方法一：问题拆解，俩俩比较，注意这里是前缀公共串
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            ans=getLongestCommonPrefix(ans,strs[i]);
            if(ans==null||ans.length()==0){
                return "";
            }
        }
        return ans;
    }
    public String getLongestCommonPrefix(String a, String  b) {
        int index=0;
        while(index<a.length()&&index<b.length()&&a.charAt(index)==b.charAt(index)){
            index++;
        }
        return a.substring(0,index);
    }
}
// @lc code=end

