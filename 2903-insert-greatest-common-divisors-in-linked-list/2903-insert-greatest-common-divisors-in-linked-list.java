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
    public int gcd(int a,int b){
        if(a==1||b==1) return 1;
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode curr=head;
        ListNode currNext=head.next;
        
while(currNext!=null){
ListNode ll=new ListNode(gcd(curr.val,currNext.val),currNext);
curr.next=ll;
curr=currNext;
currNext=currNext.next;
}
return head;
    }
    
}