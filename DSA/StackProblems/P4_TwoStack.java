public class P4_TwoStack {
    int arr[];
    int capacity;
    int leftTop;
    int rightTop;

    P4_TwoStack(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        leftTop = -1;
        rightTop = capacity;
    }

    void leftPush(int e) {
        if(leftTop < rightTop - 1) {
            leftTop++;
            arr[leftTop] = e;
        }
    }

    void rightPush(int e) {
        if(leftTop < rightTop - 1) {
            rightTop--;
            arr[rightTop] = e;
        }
    }

    int leftPop() {
        if (leftTop == -1) {
            throw new RuntimeException("Left Stack is Empty...");
        }
        int element = arr[leftTop];
        arr[leftTop--] = 0;
        return element;
    }

    int rightPop() {
        if (rightTop == -1) {
            throw new RuntimeException("Right Stack is Empty...");
        }
        int element = arr[rightTop];
        arr[rightTop++] = 0;
        return element;
    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P4_TwoStack st =  new P4_TwoStack(8);
        st.leftPush(10);
        st.leftPush(20);
        st.leftPush(30);
        st.leftPush(90);
        st.leftPush(100);

        st.print();

        st.rightPush(80);
        st.rightPush(50);
        st.rightPush(60);
        // st.rightPush(70);

        st.print();
        st.leftPop();
        st.print();
        st.rightPop();
        st.print();
    }

}
