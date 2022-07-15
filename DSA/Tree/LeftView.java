import java.util.LinkedList;

public class LeftView {
    static int maxLevel = 0;
    static void leftViewRec(BinaryTree<Integer> root, int level) {
        if(root == null) {
            return;
        }
        if(maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }
        leftViewRec(root.left, level+1);
        leftViewRec(root.right, level+1);
        
    }

    static void leftViewIter(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                BinaryTree<Integer> currentNode = queue.removeFirst();
                if(i == 0) {
                    System.out.println(currentNode.data);
                }
                if(currentNode.left != null) {
                    queue.addLast(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.addLast(currentNode.right);
                }
            }
        }
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
        leftViewRec(root, 1);
    }
}
