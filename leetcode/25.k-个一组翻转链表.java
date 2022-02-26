/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode[] myReverse(ListNode head, ListNode tail) {
        ListNode prev=tail.next;
        ListNode p=head;
        while(prev!=tail){
            ListNode nex=p.next;
            p.next=prev;
            prev=p;
            p=nex;
        }
        return new ListNode[]{tail,head};
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair=new ListNode(0);
        hair.next=head;
        ListNode pre=hair;
        while(head!=null){
            ListNode tail=pre;
            for(int i=0;i<k;i++){
                tail=tail.next;
                if(tail==null){
                    return hair.next;
                }
            }
            ListNode next=tail.next;
            ListNode[] reverse=myReverse(head,tail);
            head=reverse[0];
            tail=reverse[1];
            pre.next=head;
            tail.next=next;
            pre=tail;
            head=tail.next;
        }
        return hair.next;
    }
}
// @lc code=end

