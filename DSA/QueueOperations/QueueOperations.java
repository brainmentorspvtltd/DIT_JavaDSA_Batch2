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
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getFront() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty...");
        }
        return data[front];
    }

    void enqueue(int e) {
        if(isEmpty()) {
            front = 0;
        }
        rear++;
        size++;
        if(rear == data.length) {
            rear = 0;
        }
        data[rear] = e;
    }

    int dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty...");
        }
        int temp = data[front];
        front++;
        size--;
        if(size == 0) {
            front = rear = -1;
        }
        return temp;
    }

    void print()  {
        while(!isEmpty()) {
            System.out.println(dequeue());
        }
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