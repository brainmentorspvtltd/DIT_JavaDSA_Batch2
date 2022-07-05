// class Node {
//     int data;
//     Node next;
//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LLDemo {
    public static void main(String[] args) {
        // Node n1 = new Node(10);
        // Node n2 = new Node(20);
        // Node n3 = new Node(30);
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = new Node(40);
        // n3.next.next = new Node(50);
        // n3.next.next.next = new Node(70);

        // Node start = n1;
        // while(start != null) {
        //     System.out.println(start.data);
        //     start = start.next;
        // }

        // Node<Integer> n1 = new Node<>(12);
        // n1.next = new Node<>(14);
        // n1.next.next = new Node<>(16);

        Node<String> n1 = new Node<>("hello");
        n1.next = new Node<>("hey");

    }
}