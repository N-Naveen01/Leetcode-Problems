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
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next=null;
        ListNode left = head;
        ListNode right = reverse(mid);

        while(left!=null && right!=null){
            ListNode temp1=left.next;
            ListNode temp2=right.next;

            left.next=right;
            right.next=temp1;
            
            left=temp1;
            right=temp2;
        }

    }
    private ListNode reverse(ListNode lst){
        ListNode cur =lst , prev=null , next =null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}