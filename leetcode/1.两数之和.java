/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]result=new int[2];
        HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)&&map.get(temp)!=i){
                result[0]=i;
                result[1]=map.get(temp);
                break;
            }
        }
        return result;
   }
}
// @lc code=end

