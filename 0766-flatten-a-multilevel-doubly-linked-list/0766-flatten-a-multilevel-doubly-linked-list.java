/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        ArrayList<Node> nex = new ArrayList<>();
        Node curr = head;

        while (true) {
            if (curr.child == null && curr.next != null) {
                curr = curr.next;
            } else if (curr.child != null) {
                if (curr.next != null) {
                    nex.add(curr.next);
                }
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                curr = curr.next;
            } else if (curr.next == null && nex.size() > 0) {
                Node temp = nex.remove(nex.size() - 1);
                curr.next = temp;
                if (temp != null) temp.prev = curr; 
                curr = curr.next;
            } else if (curr.next == null && nex.size() == 0) {
                break;
            }
        }

        return head;
    }
}
