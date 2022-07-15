import java.util.ArrayList;
import java.util.LinkedList;

public class DiagonalView {
    // if left child exists than add in queue
    // if right child exists than print
    static void diagonalView(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.addLast(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> smallAns = new ArrayList<>();
            while(size-- > 0) {
                BinaryTree<Integer> node = queue.removeFirst();
                while(node != null) {
                    smallAns.add(node.data);
                    if(node.left != null) {
                        queue.addLast(node.left);
                    }
                    node = node.right;
                }
            }
            System.out.println(smallAns);
        }
    }
}
