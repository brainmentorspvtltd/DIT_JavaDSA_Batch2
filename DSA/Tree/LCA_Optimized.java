public class LCA_Optimized {
    static TreeNode lca(TreeNode root, int n1, int n2) {
        if(root == null) {
            return null;
        }
        if(root.data == n1 || root.data == n2) {
            return root;
        }
        TreeNode lc_1 = lca(root.left, n1, n2);
        TreeNode lc_2 = lca(root.right, n1, n2);
        if(lc_1 != null && lc_2 != null){
            return root;
        }
        if(lc_1 != null) {
            return lc_1;
        }
        else{
            return lc_2;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);
        root.left.left.left = new TreeNode(80);

        TreeNode ans = lca(root, 80, 50);
        System.out.println("LCA : " + ans.data);
    }
}
