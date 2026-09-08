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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head==null || head.next==null || left==right){
            return head;
        }
        ListNode last=null;
        ListNode temp=head;
        int times=right-left+1;
        int pos=1;
        while(pos<left){
            last=temp;
            pos++;
            temp=temp.next;
        }
        ListNode current=temp;
        ListNode prev=null;
        ListNode nxt=current;
        int t=times;
        while(times-- > 0){
            nxt=current.next;
            current.next=prev;
            prev=current;
            current=nxt;
        }
        if(current==null && t==right){
            head=prev;
            return head;
        }
        if(left!=1){
            last.next=prev;
        }
        temp.next=current;
        if(left==1){
            head=prev;
        }
        return head;
    }
}