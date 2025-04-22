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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode();
        if(lists.length==0) return dummy.next;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(ListNode ln:lists){
            while(ln!=null){
                pq.add(ln.val);
                ln=ln.next;
            }
        }
        ListNode curr=dummy;
        while(!pq.isEmpty()){
            curr.next=new ListNode(pq.remove());
            curr=curr.next;
        }
        return dummy.next;
    }
}