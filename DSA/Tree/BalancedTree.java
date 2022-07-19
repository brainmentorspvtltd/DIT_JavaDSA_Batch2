public class BalancedTree {
    // static int height(BinaryTree<Integer> root) {
    //     if(root == null) {
    //         return 0;
    //     }
    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);
    //     return 1 + Math.max(leftHeight, rightHeight);
    // }

    // boolean isBalanced(BinaryTree<Integer> root) {
    //     if(root == null) {
    //         return true;
    //     }
    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);
    //     return (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    // }

    static int isBalanced(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = isBalanced(root.left);
        if(leftHeight == -1) {
            return -1;
        }

        int rightHeight = isBalanced(root.right);
        if(rightHeight == -1) {
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        else {
            return Math.max(leftHeight, rightHeight) + 1;
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
        int diff = isBalanced(root);
        System.out.println("Diff is : " + diff);
    }

}
