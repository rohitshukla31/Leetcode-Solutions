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
    public ListNode middleNode(ListNode head) {
        // int length=0;
        // ListNode temp=head;
        // while(temp != null){
        //     temp=temp.next;
        //     length++;
        // }
        // temp=head;
        // for(int i=0;i<length/2;i++){
        //     temp=temp.next;
        // }
        // return temp;

        //=========Slow and fast approach========
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null){ 
            return slow;
        }
        return slow.next;
    }
}