public class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;  
    }

}
class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;

    }
    
    
    
    public void addAtHead(int val) {
Node newNode=new Node(val);
        if(size==0){
        
        head=newNode;
        tail=newNode;
        size++;
        }else{
newNode.next=head;
head=newNode;
size++;
        }

    }
    
    public void addAtTail(int val) {
       Node newNode=new Node(val);
        if(size==0){
        
        head=newNode;
        tail=newNode;
        size++;
        }else{
tail.next=newNode;
tail=newNode;
size++;
        }
    }

    public int get(int index) {
        if(size<index || index>size-1) return -1;
        if(index==0) return head.data;
        if(index==(size-1)) return tail.data;
        Node current=head;
        int count=0;
        while(current!=null&&count<index){
            current=current.next;
            count++;

        }
        return current.data;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode=new Node(val);
        if(index>size) return;

        else if(index==0){
            newNode.next=head;
            head=newNode;
            size++;
        }
        else if(index==size){
            tail.next=newNode;
            tail=newNode;
            size++;
        }else{
            Node curr=head;
            int count=0;
            while(curr!=null){
                if(index-1==count) break;
                curr=curr.next;
                count++;
            }
            Node c2=curr.next;
            curr.next=newNode;
            newNode.next=c2;
            size++;
        }
    }
    public void deleteAtIndex(int index) {
    // If index is out of bounds, do nothing
    if (index >= size || index < 0) return;
    
    // If deleting the head node
    if (index == 0) {
        head = head.next;
        size--;
        // If the list is now empty, update the tail to null
        if (head == null) {
            tail = null;
        }
        return;
    }

    // Traverse to the node just before the one to be deleted
    int count = 0;
    Node curr = head;
    while (curr != null && count < index - 1) {
        count++;
        curr = curr.next;
    }

    // Check if the node to delete is the last node (tail node)
    if (index == size - 1) {
        curr.next = null;
        tail = curr;
    } else {
        // Delete the node at the specified index
        curr.next = curr.next.next;
    }
    size--;
}

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */