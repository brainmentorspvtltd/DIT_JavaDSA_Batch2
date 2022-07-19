class BST {
    int data;
    BST left;
    BST right;
    BST(int data) {
        this.data = data;
    }
}

public class BSTOperations {
    BST root;
    static BST insert(BST root, int data) {
        if(root == null) {
            return new BST(data);
        }
        else if(root.data < data) {
            root.right = insert(root.right, data);
        }
        else if(root.data > data) {
            root.left = insert(root.left, data);
        }
        return root;
    }

    static BST search(BST root, int data) {
        if(root == null || root.data == data) {
            return root;
        }
        else if(root.data < data) {
            return search(root.right, data);
        }
        return search(root.left, data);
    }

    int minValue() {
        return -1;
    }

    int maxValue() {
        return -1;
    }

    void removeNode(BST currentNode, BST parentOfCurrent, boolean isLeft, int data) {
        if(data > currentNode.data) {
            removeNode(currentNode.right, parentOfCurrent, false, data);
        }
        else if(data < currentNode.data) {
            removeNode(currentNode.left, parentOfCurrent, true, data);
        }
        else {
            // Case 1 : when both child's are null
            if(currentNode.left == null && currentNode.right == null) {
                if(isLeft) {
                    parentOfCurrent.left = null;
                }
                else {
                    parentOfCurrent.right = null;
                }
            }
            // Case 2 : when left child is null
            if(currentNode.left == null && currentNode.right != null) {
                if(isLeft) {
                    parentOfCurrent.left = currentNode.right;
                }
                else {
                    parentOfCurrent.right = currentNode.right;
                }
            }
            // Case 3 : when right is null
            if(currentNode.left != null && currentNode.right == null) {
                if(isLeft) {
                    parentOfCurrent.left = currentNode.left;
                }
                else {
                    parentOfCurrent.right = currentNode.left;
                }
            }
            // Case 4 : when both child's are not null
            if(currentNode.left != null && currentNode.right != null) {
                
            }
        }
    }

    static void print(BST root) {
        if(root != null) {
            print(root.left);
            System.out.print(root.data + ", ");
            print(root.right);
        }
    }

    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(12);
        root.right.right = new BST(20);
        root = insert(root, 13);
        print(root);
    }
}
