/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head0=new ListNode(0,head);
        if(head==null||head.next==null){ 
            return head;
        }
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            while(next!=null&&next.val==cur.val){ 
                next=next.next;
            }
            cur.next=next;
            cur=next;
        }
        return head0.next;
    }
}
// @lc code=end

