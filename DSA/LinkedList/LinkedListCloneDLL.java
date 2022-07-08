import java.util.HashMap;

class NodeDLL {
    int data;
    NodeDLL next, random;
    NodeDLL(int data) {
        this.data = data;
        next = random = null;
    }
}

public class LinkedListCloneDLL {
    static void clone(NodeDLL head) {
        HashMap<NodeDLL, NodeDLL> map = new HashMap<>();
        for(NodeDLL current = head; current != null; current=current.next) {
            map.put(current, new NodeDLL(current.data));
        }

        for(NodeDLL current = head; current != null; current = current.next) {
            NodeDLL cloneCurrent = map.get(current);
            cloneCurrent.next = map.get(current.next);
            cloneCurrent.random = map.get(current.random);
        }
        NodeDLL head_2 = map.get(head);
    }

    static void cloneOptimized(NodeDLL head) {
        
    }

    public static void main(String[] args) {
        NodeDLL head = new NodeDLL(10);
        head.next = new NodeDLL(20);
        head.next.next = new NodeDLL(30);
        head.next.next.next = new NodeDLL(40);
        head.next.next.next.next = new NodeDLL(50);

        head.random = head.next.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next;
        head.next.next.next.next.random = head.next.next.next;

        clone(head);

    }
}
