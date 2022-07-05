class NodeA<T> {
    T data;
    NodeA<T> next;
    public NodeA(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCRUD<T> {
    private NodeA<T> start;
    int count;
    void insertAtBeg(NodeA<T> node) {
        // If Linked List is Empty, then insert at beginning and return
        count++;
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(NodeA<T> node) {
        count++;
        // If Linked List is Empty, then insert at beginning and return
        if(start == null) {
            start = node;
            return;
        }
        
        // If Linked List has one node only...
        if(start.next == null) {
            start.next = node;
            return;
        }
        
        NodeA<T> current = start;
        // Reach to the last node
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    void insertAtMid(NodeA<T> node, int pos) {
        if(pos > count) {
            throw new RuntimeException("Position is not valid...");
        }
        
        count++;
        // If Linked List is Empty, then insert at beginning and return
        if(start == null) {
            start = node;
            return;
        }
        if(pos == 0) {
            node.next = start;
            start = node;
            return;
        }

        if(pos > 1) {
            int i = 0;
            NodeA<T> temp = start;
            while(i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void deleteInMid() {

    }

    void reverseIterate() {

    }

    void display() {
        NodeA<T> temp = start;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListCRUD<Integer> operations = new LinkedListCRUD<>();
        operations.insertAtBeg(new NodeA<Integer>(12));
        operations.insertAtBeg(new NodeA<Integer>(14));
        operations.insertAtBeg(new NodeA<Integer>(17));
        operations.insertAtEnd(new NodeA<Integer>(11));
        operations.insertAtEnd(new NodeA<Integer>(49));
        operations.insertAtMid(new NodeA<Integer>(100), 3);

        operations.display();
    }
}
