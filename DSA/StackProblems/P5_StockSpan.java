import java.util.Stack;

public class P5_StockSpan {
    static void approach_1(int price[], int n, int s[]) {
        s[0] = 1;
        for(int i = 1; i < n; i++) {
            s[i] = 1;
            for(int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--) {
                s[i]++;
            }
        }
        for(int i : s) {
            System.out.print(i + ", ");
        }
    }

    static int[] approach_2(int price[], int n, int s[]) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        s[0] = 1;
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            s[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return s;
    }
    
    public static void main(String[] args) {
        int arr[] = {10,20,15,16,18,9,7,6,25};
        int n = arr.length;
        int s[] = new int[n];
        approach_1(arr, n, s);
        System.out.println();
        System.out.println("==================");
        int res[] = approach_2(arr, n, s);
        for(int i : res) {
            System.out.print(i + ", ");
        }
    }
}
