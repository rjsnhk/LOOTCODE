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
        if(head==null||nums.length==0) return head;
HashSet hs=new HashSet<>();
for(int i:nums){
    hs.add(i);
}

ListNode temp=new ListNode(0);
temp.next=head;

ListNode curr=temp.next;
ListNode prev=temp;
while(curr!=null){
if(hs.contains(curr.val)){
    prev.next=curr.next;
    curr=prev.next;
}else{
prev=curr;
curr=curr.next;
}
}
return temp.next;
        
    }
}