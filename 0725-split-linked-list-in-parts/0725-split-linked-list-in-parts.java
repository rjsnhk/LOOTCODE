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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        
        ListNode ar[]=new ListNode[k];
        if(head==null) return ar;
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int div=c/k;
        int rem=0;
        if(div>0)rem=c%k;
        temp=head;
        for(int i=0;i<k;i++){
            ar[i]=temp;
            for(int j=1;j<div;j++){
                if(temp.next!=null)temp=temp.next; else break;
            }
            if(rem>0){
                if(temp.next!=null){temp=temp.next;
                rem--;}
            }
            if(temp.next!=null){ListNode temp2=temp.next;
            temp.next=null;
            temp=temp2;}else break;
        }
        return ar;
    }
}