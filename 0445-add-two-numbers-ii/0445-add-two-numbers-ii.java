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
    public ListNode rev(ListNode head){
 ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){

            ListNode curr2=curr.next;
            curr.next=prev;
            prev=curr;
            curr=curr2;
        }
        head=prev;
        return head;
    } 
    public ListNode add(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode t1=l1;
        ListNode t2=l2;
        int carry=0;
        while(t1!=null||t2!=null){
            int s=carry;
            if(t1!=null) s=s+t1.val;
            if(t2!=null) s=s+t2.val;
            carry=s/10;
            ListNode newNode=new ListNode(s%10);
            curr.next=newNode;
            curr=curr.next;
            if(t1!=null) t1=t1.next;
            if (t2!=null) t2=t2.next;
        }
        if(carry!=0){
            ListNode last=new ListNode(carry);
            curr.next=last;
        }
        return dummy.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l11=rev(l1);
        ListNode l22=rev(l2);
return rev(add(l11,l22));

    }

}