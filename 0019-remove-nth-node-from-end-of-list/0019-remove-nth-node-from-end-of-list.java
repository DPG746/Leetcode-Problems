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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null){
            fast=fast.next;
            cnt++;

        }
        if(cnt==n){
            return head.next;

        }
        fast=head;
        for(int i=0;i<(cnt-n);i++){
            prev=fast;
            fast=fast.next;

        }
        prev.next=fast.next;

        return head;

        
    }
}