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
    public void reverse(ListNode x, int times){
        ListNode current=x;
        ListNode previous=null;
        ListNode nxt=null;
        while(times>0){
            nxt=current.next;
            current.next=previous;
            previous=current;
            current=nxt;
            times--;
        }
        return;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int size=k;
        ListNode left=head;
        ListNode right=head;
        ListNode previous_left=null;
        ListNode next_left=null;
        ListNode res=null;
        while(true){
            left=right;
            for(int i=0; i<size-1; i++){
                if(right!=null){
                    right=right.next;
                }
            }
            if(right!=null){
                //reverse
                next_left=right.next;
                reverse(left, size);
                if(res==null){
                    res=head=right;
                }
                if(previous_left!=null){
                    previous_left.next=right;
                }
                previous_left=left;
                left.next=next_left;
                right=next_left;
            }else{
                //right==null
                if(previous_left!=null){
                    previous_left=left;
                }
                break;
            }
        }
        return head;
    }
}