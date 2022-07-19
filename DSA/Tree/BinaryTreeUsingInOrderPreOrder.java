public class BinaryTreeUsingInOrderPreOrder {
    int preIndex = 0;
    TreeNode buildTree(int []preOrder, int []inOrder) {
        int n = inOrder.length;
        TreeNode node = helper(preOrder, inOrder, 0, n-1);
        return node;
    }

    TreeNode helper(int []preOrder, int []inOrder, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preIndex++]);
        int inOrderIndex = startIndex;

        for(int i = startIndex; i <= endIndex; i++) {
            if(inOrder[i] == root.data) {
                inOrderIndex = i;
                break;
            }
        }

        root.left = helper(preOrder, inOrder, startIndex, inOrderIndex-1);
        root.right = helper(preOrder, inOrder, inOrderIndex+1, endIndex);
        return root;

    }
}
