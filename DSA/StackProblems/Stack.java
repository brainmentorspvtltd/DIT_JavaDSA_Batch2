import java.util.ArrayList;

public class Stack<T> {
    int capacity;
    int top;
    ArrayList<T> arr;
    Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        arr = new ArrayList<>();
    }

    int getSize() {
        return top;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public void push(T element) {
        if(getSize() == capacity - 1) {
            throw new RuntimeException("Stack is full...");
        }
        top++;
        arr.add(top, element);
    }

    public T pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty...");
        }
        T element = arr.remove(top);
        top--;
        return element;
    }

    T peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty...");
        }
        return arr.get(top);
    }

    public static void main(String[] args) {
        Stack<String> st = new Stack<>(5);
        st.push("hello");
        st.push("hey");
        st.push("hi");

        System.out.println(st.pop());
        System.out.println(st.peek());
    }

}
