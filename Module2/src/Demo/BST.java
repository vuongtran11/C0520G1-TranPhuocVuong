package demo;

public class BST<Integer extends Comparable<Integer>> {
    TreeNode<Integer> root;
    int size;

    public void insert(Integer e) {

        if (this.root == null) {
            this.root = new TreeNode<>(e);
        } else {
            TreeNode rootTmp = this.root;
            TreeNode parent = null;

            while (rootTmp != null) {
                if (e.compareTo((Integer) rootTmp.e) < 0) {
                    parent = rootTmp;
                    rootTmp = rootTmp.left;
                } else if (e.compareTo((Integer) rootTmp.e) > 0) {
                    parent = rootTmp;
                    rootTmp = rootTmp.right;
                } else {
                    return;
                }
            }

            if (e.compareTo((Integer) parent.e) < 0) {
                parent.left = new TreeNode(e);
            } else {
                parent.right = new TreeNode(e);
            }
        }
        size++;
    }

    public void print(TreeNode root) {
        if (root != null) {
            System.out.println(root.e);
            print(root.left);
            print(root.right);
        }
    }
}
