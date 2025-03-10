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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode prev=dummy,cur=head;

        while(true){
            ListNode temp=cur;

            int c=0;
            while(temp!=null && c<k){
                temp=temp.next;
                c++;
            }
            if(c<k) break;

            ListNode prevele=null;

            for(int i=0;i<k;i++){
                ListNode next = cur.next;
                cur.next=prevele;
                prevele=cur;
                cur=next;
            }
            ListNode lastNode = prev.next;
            lastNode.next=cur;
            prev.next=prevele;

            prev=lastNode;


        }
        return dummy.next;

        
    }
}