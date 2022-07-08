import java.util.Stack;

public class P1_StackUsingJava {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("hello");
        st.push("hi");
        st.push("hey");
        st.push("bye");

        System.out.println(st.pop());

        System.out.println(st.peek());

    }
}
