import java.util.ArrayList;

public class LCA {
    boolean findPath(BinaryTree<Integer> root, ArrayList<BinaryTree<Integer>> path, int n) {
        if(root == null) {
            return false;
        }
        path.add(root);
        if(root.data == n) {
            return true;
        }
        if(findPath(root.left, path, n) || findPath(root.right, path, n)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    BinaryTree<Integer> lca(BinaryTree<Integer> root, int n1, int n2) {
        ArrayList<BinaryTree<Integer>> path_1 = new ArrayList<>();
        ArrayList<BinaryTree<Integer>> path_2 = new ArrayList<>();
        if(findPath(root, path_1, n1) == false || findPath(root, path_2, n2) == false) {
            return null;
        }
        for(int i = 0; i < path_1.size() - 1 && i < path_2.size() - 1; i++) {
            if(path_1.get(i + 1) != path_2.get(i + 1)) {
                return path_1.get(i);
            }
        }
        return null;
    }
}
