class Node2 {
    int data;
    Node2 next;
    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIntersection {
    private Node2 head_1;
    private Node2 head_2;

    int get_count(Node2 node) {
        Node2 temp = node;
        int counter = 0;
        while(temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    int getNode() {
        int n1 = get_count(head_1);
        int n2 = get_count(head_2);

        int d;
        if(n1 > n2) {
            d = n1 - n2;
            return getIntersection(d, head_1, head_2);
        }
        else {
            d = n2 - n1;
            return getIntersection(d, head_2, head_1);
        }

    }

    int getIntersection(int d, Node2 node_1, Node2 node_2) {
        int i;
        Node2 current_1 = node_1;
        Node2 current_2 = node_2;
        for(i = 0; i < d; i++){
            if(current_1 == null) {
                return -1;
            }
            current_1 = current_1.next;
        }

        while(current_1 != null && current_2 != null) {
            if(current_1.data == current_2.data) {
                return current_1.data;
            }
            current_1 = current_1.next;
            current_2 = current_2.next;
        }
        return -1;
    }

}
