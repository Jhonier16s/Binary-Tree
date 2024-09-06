package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeManager {

    TreeNode root;

    public TreeManager() {
        root = null;
    }

    public void add(TreeNode n) {
        add(root, n);
    }

    private void add(TreeNode r, TreeNode n) {
        if (root == null) {
            root = n;
        } else {
            if (r.value < n.value) {
                if (r.right == null) {
                    r.right = n;
                } else {
                    add(r.right, n);
                }
            } else {
                if (r.left == null) {
                    r.left = n;
                } else {
                    add(r.left, n);
                }
            }
        }
    }

    public void showInOrder() {
        showInOrder(root);
    }

    private void showInOrder(TreeNode r) {
        if (r != null) {
            showInOrder(r.left);
            System.out.println(r.value);
            showInOrder(r.right);
        }
    }

    public void showPreOrder() {
        showPreOrder(root);
    }

    private void showPreOrder(TreeNode r) {
        if (r != null) {
            System.out.println(r.value);
            showPreOrder(r.left);
            showPreOrder(r.right);

        }
    }

    public void showPosOrder() {
        showPosOrder(root);
    }

    private void showPosOrder(TreeNode r) {
        if (r != null) {
            showPosOrder(r.left);
            showPosOrder(r.right);
            System.out.println(r.value);

        }
    }

    public void showBreadth() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println(current.value);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

}
