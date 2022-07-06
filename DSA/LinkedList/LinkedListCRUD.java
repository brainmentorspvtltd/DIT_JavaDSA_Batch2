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
    int get_count() {
        NodeA<T> temp = start;
        int counter = 0;
        while(temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    void insertAtBeg(NodeA<T> node) {
        // If Linked List is Empty, then insert at beginning and return
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(NodeA<T> node) {
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
        int count = get_count();
        if(pos > count) {
            throw new RuntimeException("Position is not valid...");
        }
        
        // If Linked List is Empty, then insert at beginning and return
        if(start == null) {
            start = node;
            return;
        }
        if(pos == 0) {
            insertAtBeg(node);
        }

        if(pos > 1) {
            int i = 1;
            NodeA<T> temp = start;
            while(i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void deleteInMid(int pos) {
        // If linked list is empty
        if(start == null) {
            System.out.println("List is Empty...");
            return;
        }
        
        NodeA<T> temp = null;
        if(pos == 0) {
            temp = start.next;
            start = temp;
            return;
        }

        int i = 1;
        temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    void reverseIterate() {
        if(start == null) {
            System.out.println("List is Empty...");
            return;
        }

        if(start.next == null) {
            System.out.println("List contains only one item...");
            return;
        }

        NodeA<T> currentNode = start;
        NodeA<T> prevNode = null;
        while(currentNode != null) {
            NodeA<T> nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        start = prevNode;
    }

    NodeA<T> reverseIterateRec(NodeA<T> currentNode, NodeA<T> prevNode) {
        if(currentNode == null) {
            return prevNode;
        }
        NodeA<T> nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseIterateRec(nextNode, currentNode);
    }

    void midPoint() {
        NodeA<T> slow;
        NodeA<T> fast;
        slow = fast = start;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            // System.out.println(slow.data + "," + fast.data);
        }
        System.out.println("Mid Point is : " + slow.data);
    }
    
    void findKthFromEnd(int k) {
        int n = get_count();
        int x = n-k+1;
        NodeA<T> temp = start;
        for(int i = 1; i < x; i++) {
            temp = temp.next;
        }
        System.out.println("Kth Node  Data is : " + temp.data);
    }

    void findKthFromEndApproach_2(int k) {
        NodeA<T> p;
        NodeA<T> q;
        p = q = start;
        for(int i = 1; i <= k; i++) {
            p = p.next;
        }
        while(p != null) {
            p = p.next;
            q = q.next;
        }
        System.out.println("Kth Node data is : " + q.data);
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
        operations.insertAtEnd(new NodeA<Integer>(51));
        operations.insertAtMid(new NodeA<Integer>(100), 3);

        operations.display();

        operations.deleteInMid(3);
        System.out.println("List After Deletion at 3rd index...");
        operations.display();

        System.out.println("List After Reverse Iteration...");
        operations.reverseIterate();
        operations.display();

        System.out.println("Mid Point....");
        operations.midPoint();

        System.out.println("============================");
        operations.display();

        operations.findKthFromEnd(3);
        operations.findKthFromEndApproach_2(3);
    }
}
