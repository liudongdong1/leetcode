/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode head0=new ListNode(0);
        head0.next=head;
        ListNode pre=head0;
        while(pre!=null){ 
            ListNode temp=pre.next;
            while(temp!=null && temp.val==val){ 
                temp=temp.next;
            }
            pre.next=temp;
            pre=temp;
        }
        return head0.next;
    }
}
// @lc code=end

