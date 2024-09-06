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
    public ListNode modifiedList(int[] nums, ListNode head) {
    //    int max=0;
    //    for(int i:nums){
    //     max=Math.max(max,i);
    //    }
       boolean ar[]=new boolean[(int)1e5+1];


       for(int i:nums){
        ar[i]=true;
       }
       ListNode curr=head;
       ListNode prev=null;
       while(curr!=null){
        if(ar[curr.val]){
            if(prev==null){
                head=head.next;
                curr.next=null;
                curr=head;
                
            }else{
                prev.next=curr.next;
                curr.next=null;
                curr=prev.next;

            }
        }else{
            prev=curr;
            curr=curr.next;
        }
       }
       return head;
        
    }
}