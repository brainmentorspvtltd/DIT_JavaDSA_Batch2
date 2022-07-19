import java.util.Stack;

public class SpiralOrder {
    void printSpiral(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> oddStack = new Stack<>();
        Stack<BinaryTree<Integer>> evenStack = new Stack<>();
        oddStack.push(root);

        while(!oddStack.isEmpty() || !evenStack.isEmpty()) {
            while(!oddStack.isEmpty()) {
                BinaryTree<Integer> temp = oddStack.pop();
                System.out.println(temp.data);
                if(temp.right != null) {
                    evenStack.push(temp.right);
                }
                if(temp.left != null) {
                    evenStack.push(temp.left);
                }
            }

            while(!evenStack.isEmpty()) {
                BinaryTree<Integer> temp = evenStack.pop();
                System.out.println(temp.data);
                if(temp.left != null) {
                    oddStack.push(temp.left);
                }
                if(temp.right != null) {
                    oddStack.push(temp.right);
                }
            }
        }
    }
}
