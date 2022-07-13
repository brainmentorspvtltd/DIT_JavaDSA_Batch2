import java.util.LinkedList;
import java.util.Queue;

public class GenKDigits {
    public static void main(String[] args) {
        int n = 10;
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        for(int i  = 0; i < n; i++) {
            String current = q.poll();
            System.out.println(current);
            q.add(current + "5");
            q.add(current + "6");
        }
    }
}
