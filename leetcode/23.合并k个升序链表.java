/*
* @lc app=leetcode.cn id=23 lang=java
*
* [23] 合并K个升序链表
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
    class Status implements Comparable<Status>{
        int val;
        ListNode ptr;
        Status(int val, ListNode prt){ 
            this.val = val;
            this.ptr=prt;
        }
        public int compareTo(Status status){
            return this.val - status.val;
        }
    }

    PriorityQueue<Status>queue=new PriorityQueue<Status>();
        
    public ListNode mergeKLists(ListNode[] lists) {
        for(ListNode list : lists){
            if(list!=null){
                queue.offer(new Status(list.val, list));
            }
        }
        ListNode head0=new ListNode(0);
        ListNode tail=head0;
        while(!queue.isEmpty()){
            Status status=queue.poll();
            tail.next=status.ptr;
            tail=tail.next;
            if(status.ptr.next!=null){
                queue.offer(new Status(status.ptr.next.val, status.ptr.next));
            }
        }
        return head0.next;
    }
}
// @lc code=end

