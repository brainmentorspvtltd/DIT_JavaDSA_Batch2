import java.util.Stack;

public class P6_PreviousGreaterElement {
    
    static void approach(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        System.out.print(-1 + ",");
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            int greater = (st.isEmpty()) ? -1 : st.peek();
            System.out.print(greater + ",");
            st.push(arr[i]);
        }
    }

}
