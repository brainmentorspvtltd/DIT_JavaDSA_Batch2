public class Ancestors {
    static boolean printAncestors(BinaryTree<Integer> node, int target) {
        if(node == null) {
            return false;
        }
        // When we reach target node then return
        if(node.data == target) {
            return true;
        }

        // if target is present in either left or right subtree
        if(printAncestors(node.left, target) || printAncestors(node.right, target)) {
            System.out.println(node.data + " ");
            return true;
        }
        return false;
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
        root.left.left.left = new BinaryTree<Integer>(90);
        printAncestors(root, 90);
    }
}
