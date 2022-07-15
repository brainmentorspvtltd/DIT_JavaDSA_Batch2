public class ChildrenSumProperty {
    boolean isSum(BinaryTree<Integer> root) {
        if(root == null) {
            return true;
        }

        // tree is traversed completely
        if(root.left == null && root.right == null) {
            return true;
        }

        int sum = 0;
        if(root.left != null) {
            sum += root.left.data;
        }
        if(root.right != null) {
            sum += root.right.data;
        }

        return (root.data == sum && isSum(root.left) && isSum(root.right));

    }
}
