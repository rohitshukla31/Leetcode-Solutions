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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return new int[]{-1,-1};
        }

        int minDistance=-1;
        int maxDistance=-1;

        ListNode temp=head;
        ListNode prev=null;
        ListNode next; 

        int size=0;

        ArrayList<Integer> list=new ArrayList<>();

        while(temp.next !=null && temp.next.next != null){
            size++;
            prev=temp;
            temp=temp.next;
            next=temp.next;            
            if((temp.val>prev.val && temp.val>next.val) || (temp.val<prev.val && temp.val<next.val)){
                list.add(size);
            }
        }
        int n=list.size();
        if(n>=2){
            maxDistance=list.get(n-1)-list.get(0);
            minDistance=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                int Distance=list.get(i+1)-list.get(i);
                minDistance=Math.min(minDistance,Distance);
            }            
        }   
    
        return new int[]{minDistance, maxDistance};

        //======= Optimized Solution ========
        
    }
}