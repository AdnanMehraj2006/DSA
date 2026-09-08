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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int length=1;
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
            length++;
        }
        k=k%length;
        if(k==0) return head;
        int pos=length-k;
        ListNode newHead=head;
        ListNode prevtohead=null;
        for(int i=1; i<=pos && newHead.next!=null; i++){
            prevtohead=newHead;
            newHead=newHead.next;
        }
        current.next=head;
        prevtohead.next=null;
        return newHead;
    }
}