/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    //方法一： 使用INT空间长度数组
    //方法二: 使用HashMap 进行计数   O(n), O(n)
    //方法三： 将数组进行排序，然后取中间值   O(nlogn), O(1)
    //方法四： 投票算法，对冲思想，遇到相同的加1，遇到不同的减一
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Map<Integer,Integer> result = new HashMap<Integer,Integer>();
        int i=0;
        for(;i<nums.length;i++){
            if(!result.containsKey(nums[i])){
                result.put(nums[i],1);
            }else{
                result.put(nums[i],result.get(nums[i])+1);
                if(result.get(nums[i])*2>nums.length){
                    break;
                }
            }
        }
        return nums[i];
    }

    public int majorityElementV1(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int count=1,value=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                value=nums[i];
            }
            if(value==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return value;
    }
}
// @lc code=end

