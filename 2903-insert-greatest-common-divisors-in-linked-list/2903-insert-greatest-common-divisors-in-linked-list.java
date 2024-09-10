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
        int c=Math.min(a,b);
        int res=-1;
        for(int i=1;i<=c;i++){
            if(a%i==0&&b%i==0){
                res=i;
            }
        }
        return res;
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