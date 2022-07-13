public class CircularQueue {
    int array[];
    int front;
    int rear;
    final int DEFAULT_CAPACITY = 10;
    CircularQueue() {
        array = new int[DEFAULT_CAPACITY];
        rear = front = 0;
    }
    CircularQueue(int capacity) {
        array = new int[capacity];
        rear = front = 0;
    }

    int getSize() {
        return rear;
    }

    boolean isEmpty() {
        return rear == 0;
    }

    void enqueue(int data) {
        if(rear == array.length) {
            System.out.println("Queue is Full...");
        }

        int availIndex = (rear + front) % array.length;
        array[availIndex] = data;
        rear++;
    }

    int dequeue() {
        if(rear == 0) {
            throw new RuntimeException("Queue is Empty...");
        }
        int value = array[front];
        array[front] = 0;
        front = (front + 1) % array.length;
        rear--;
        return value;
    }

}
