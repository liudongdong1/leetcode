/*
 * @lc app=leetcode.cn id=1290 lang=java
 *
 * [1290] 二进制链表转整数
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {  //todo  这个代码有问题
        List<Integer> list = new ArrayList<Integer>();
        while(head!=null) {
            list.add(head.val);
            head=head.next;
        }
        int sum=0;
        for(int i=list.size()-1;i>=0;i--) {
            sum=2^(list.size()-1-i)*list.get(i)+sum;
        }
        return sum;
    }
    public int getDecimalValue1(ListNode head) {
        int ans=0;
        while(head!=null) {
                ans=ans*2+head.val;
                head=head.next;
        }
        return ans;
    }
}
// @lc code=end

