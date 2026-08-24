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
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }

        k=k%n;

        while(k>0){
        ListNode tail=head;
        for(int i=0;i<n-1;i++){
            tail=tail.next;
        }
        ListNode prev=head;
        for(int i=0;i<n-2;i++){
            prev=prev.next;
        }
            ListNode last;
            last=tail;
            prev.next=null;
            last.next=head;
            head=last;
            k--;
            
        }
        return head;
    }
}