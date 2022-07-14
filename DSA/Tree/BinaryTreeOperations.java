import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

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

    void preOrderIterative(BinaryTree<Integer> root) {
        // Root, Left, Right
        /*
         * 1. Create an Empty Stack
         * 2. Push root node in stack
         * 3. While Stack is not empty
         *      - pop an item from stack & print it
         *      - push right child of popped item in stack
         *      - push left child of popped item in stack
         */
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> st = new Stack<>();
        BinaryTree<Integer> current = root;
        while(!st.isEmpty() || current != null) {
            if(!st.isEmpty() && current == null) {
                current = st.pop();
            }
            System.out.println(current.data);
            if(current.right != null) {
                st.push(current.right);
            }
            current = current.left;
        }
    }

    ArrayList<Integer> postOrderIterative(BinaryTree<Integer> root) {
        // Left, Right, Root
        /*
         * 1. If right child exist of 1
         *      - push 3 to stack, push 1 to stack and move to left child
         *      Stack : 3,1
         * 2. If right child of 2 exists
         *      - push 5 to stack, push 2 to stack and move to left child
         *      Stack : 3,1,5,2
         * 3. Now right child do not exists for 4
         *      - push 4 to stack and move to left
         *      Stack : 3,1,5,2,4
         * 4. Current Node is null
         *      - Pop 4 from Stack. Right child of 4 doesn't exists
         *      - Print 4 and set current node to null
         *      Stack : 3,1,5,2
         * 5. Current Node is null
         *      - Pop 2 from stack
         *          - check if stack peek and popped element right node is same
         *      - Pop 5 from stack and push 2 back into stack
         *      - Move current node to right child of 2 i.e.,5
         *      Stack : 3,1,2
         * 6. Right child of 5 doesn't exists, push 5 to stack, move to left child
         *      Stack : 3,1,2,5
         * 7. Current Node is Null. Pop 5 from stack
         *      - Print 5 and set current node to null
         *      Stack : 3,1,2
         * 8. Current Node is Null. Pop 2 from stack
         *      - check if stack peek and popped element right node is same
         *      - print 2 and set current node to null
         *      Stack : 3,1
         * 9. Current Node is null
         *      - Pop 1 from stack
         *          - check if stack peek and popped element right node is same
         *      - Pop 3 from stack and push 1 back into stack
         *      - Move current node to right child of 1 i.e., 3
         *      Stack : 1
         * 10. Right child of 3 exists
         *      - push 7 to stack and push 3 to stack and move to left child
         *      Stack : 1, 7, 3
         * 11. Right child of 6 doesn't exists
         *      - push 6 to stack and move to left child
         *         Stack : 1,7,3,6
         * 12. Current Node is null
         *      - pop 6 from stack, right child of 6 doesn't exists
         *      - print 6, set current node as null
         *      Stack : 1,7,3
         * 13. Current Node is null
         *      - pop 3 from stack and 
         *        check stack peek and current node right element is same
         *      - pop 7 from stack and push 3 back to stack
         *      Stack : 1,3
         */

        Stack<BinaryTree<Integer>> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        st.push(root);
        BinaryTree<Integer> prev = null;
        while(!st.isEmpty()) {
            BinaryTree<Integer> current = st.peek();
            if(prev == null || prev.left == current || prev.right == current) {
                if(current.left != null) {
                    st.push(current.left);
                }
                else if(current.right != null) {
                    st.push(current.right);
                }
                else {
                    st.pop();
                    list.add(current.data);
                }
            }

            else if(current.left == prev) {
                if(current.right != null) {
                    st.push(current.right);
                }
                else {
                    st.pop();
                    list.add(current.data);
                }
            }

            else if(current.right == prev) {
                st.pop();
                list.add(current.data);
            }
            prev = current;
        }

        return list;

    }

    void inOrderIterative() {
        // Logic
    }

    void levelOrder(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTree<Integer> node = queue.removeFirst();
            System.out.println(node.data);
            if(node.left != null) {
                queue.addLast(node.left);
            }
            if(node.right != null) {
                queue.addLast(node.right);
            }
        }
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

        tree.postOrderIterative(root);
    }    
}
