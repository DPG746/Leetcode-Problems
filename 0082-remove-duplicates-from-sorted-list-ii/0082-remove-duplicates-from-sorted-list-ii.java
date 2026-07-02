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
        ListNode dumy = new ListNode(0);
        dumy.next=head;
        ListNode curr = head;
        ListNode prev = dumy;
        int count =0;
        while(curr!=null){
            boolean dup = false;
            while(curr.next != null && curr.val==curr.next.val){
                dup = true;
                curr=curr.next;
            }
            if(dup){
                prev.next=curr.next;

            }

            else{
                prev=curr;
            }
            curr=curr.next;



        }
        return dumy.next;
    }
}