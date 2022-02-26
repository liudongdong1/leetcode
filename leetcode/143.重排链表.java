/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        if(head==null){ 
            return;
        }
        ListNode head0=new ListNode(0,head);
        List<ListNode> list = new ArrayList<ListNode>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        int i=0,j=list.size()-1;
        while(i<j){
            list.get(i).next=list.get(j);
            i++;
            if(i==j){
                break;
            }
            list.get(j).next=list.get(i);
            j--;
        }
        list.get(i).next=null;
    }
}
// @lc code=end

