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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        head=head.next;//swap head for the first swap of nodes
        ListNode prev=null, third=null;
        while(first!=null && second!=null){
            third=second.next;
            second.next=first;
            first.next=third;
            if(prev!=null){
                prev.next=second;
            }
            prev=first;
            first=third;
            if(third!=null){
                second=third.next;
            }
        }
        return head;
    }
}