class Queue {
    int data[];
    int front;
    int rear;
    int size;
    Queue(int len) {
        data = new int[len];
        front = rear = -1;
        size = 0;
    }

    int getSize() {

    }

    boolean isEmpty() {

    }

    int getFront() {

    }

    void enqueue(int e) {

    }

    int dequeue() {

    }

}

public class QueueOperations {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
    }
}