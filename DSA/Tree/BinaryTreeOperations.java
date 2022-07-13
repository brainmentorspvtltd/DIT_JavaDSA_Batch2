import java.util.Scanner;

public class BinaryTreeOperations {
    String message = "root";
    Scanner scanner = new Scanner(System.in);
    BinaryTree<Integer> insert() {
        System.out.println("Enter the " + message + " data or -1 to exit");
        int data = scanner.nextInt();
        if(data == -1) {
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<Integer>(data);
        message = "left";
        node.left = insert();
        message = "right";
        node.right = insert();
        message = "root";
        return node;
    }

    public void preOrder(BinaryTree<Integer> root) {
        // Root, Left, Right
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(BinaryTree<Integer> root) {
        // Left, Root, Right
        if(root == null) {
            return;
        }
        
        preOrder(root.left);
        System.out.println(root.data);
        preOrder(root.right);
    }

    public void postOrder(BinaryTree<Integer> root) {
        // Left, Right, Root
        if(root == null) {
            return;
        }
        
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data);
    }

    void print(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        String output = "";
        System.out.println("Root : " + root.data);
        if(root.left != null) {
            output += "L : " + root.left.data;
        }
        if(root.right != null) {
            output += "R : " + root.right.data;
        }
        System.out.println(output);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeOperations tree = new BinaryTreeOperations();
        BinaryTree<Integer> root = tree.insert();
        tree.print(root);
    }    
}
