/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        if(head == null||head.next==null){
            return head;
        }
        ListNode Head0=new ListNode(0);
        Head0.next=head;
        ListNode pre=head;
        while(pre.next!=null){
            ListNode temp=pre.next;
            pre.next=temp.next;
            Head0.next=temp;
            temp.next=head;
            head=temp;
        }
        return head;
    }
}
// @lc code=end

