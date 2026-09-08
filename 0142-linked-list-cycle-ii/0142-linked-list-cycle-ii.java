/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(fast==slow){
                slow=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                //slow==fast
                return slow;
            }
        }
        return null;
    }
}