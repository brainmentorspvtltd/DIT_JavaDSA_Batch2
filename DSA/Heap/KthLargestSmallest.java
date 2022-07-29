import java.util.PriorityQueue;

public class KthLargestSmallest {

    static void approach_1(int k) {
        int arr[] = {10,7,13,5,6,36,7,11};
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2) -> n1 - n2);
        for(int n : arr) {
            heap.add(n);
            System.out.println(heap);
            // if(heap.size() > k) {
            //     heap.poll();
            // }
        }
        // System.out.println(heap);
        System.out.println(heap.poll());
    }

    public static void main(String[] args) {
        approach_1(3);
    }
}
