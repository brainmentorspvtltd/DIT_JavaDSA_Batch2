public class CountNodesInTree {
    static int countNodes(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int counter = 1;
        counter += countNodes(root.left);
        counter += countNodes(root.right);
        return counter;
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
        int h = countNodes(root);
        System.out.println(h);
    }
}
