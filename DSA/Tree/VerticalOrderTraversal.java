import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class VerticalPair {
    BinaryTree<Integer> node = null;
    int h1 = 0;
    VerticalPair(BinaryTree<Integer> node, int h1) {
        this.node = node;
        this.h1 = h1;
    }
}

public class VerticalOrderTraversal {

    void verticalOrderIterative(BinaryTree<Integer> root) {
        LinkedList<VerticalPair> queue = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int minh1 = 0, maxh1 = 0;
        List<List<Integer>> ans = new ArrayList<>();
        queue.addLast(new VerticalPair(root, 0));
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                VerticalPair vp = queue.removeFirst();

                maxh1 = Math.max(maxh1, vp.h1);
                minh1 = Math.min(minh1, vp.h1);

                map.putIfAbsent(vp.h1, new ArrayList<>());
                map.get(vp.h1).add(vp.node.data);

                if(vp.node.left != null) {
                    queue.addLast(new VerticalPair(vp.node.left, vp.h1 - 1));
                }

                if(vp.node.right != null) {
                    queue.addLast(new VerticalPair(vp.node.right, vp.h1 + 1));
                }
            }
        }
        for(int i = minh1; i <= maxh1; i++) {
            ans.add(map.get(i));
        }
    }

    void printVerticalOrder(BinaryTree<Integer> root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        int distance = 0;
        getVerticalOrder(root, distance, map);
        for(Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }

    void getVerticalOrder(BinaryTree<Integer> node, int distance, TreeMap<Integer, ArrayList<Integer>> map) {
        if(node == null) {
            return;
        }

        if(map.get(distance) == null) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            map.put(distance, list);
        }
        else {
            ArrayList<Integer> list = map.get(distance);
            list.add(node.data);
            map.put(distance, list);
        }
        getVerticalOrder(node.left, distance-1, map);
        getVerticalOrder(node.right, distance+1, map);

    }

    public static void main(String[] args) {
        BinaryTree<Integer> root = new BinaryTree<Integer>(10);
        root.left = new BinaryTree<Integer>(20);
        root.right = new BinaryTree<Integer>(30);
        root.left.left = new BinaryTree<Integer>(40);
        root.left.right = new BinaryTree<Integer>(50);
        root.right.left = new BinaryTree<Integer>(60);
        root.right.right = new BinaryTree<Integer>(70);
        root.left.left.left = new BinaryTree<Integer>(80);

        VerticalOrderTraversal obj = new VerticalOrderTraversal();
        obj.printVerticalOrder(root);
    }
}
