package tree;

public class Tree {

    public static void main(String[] args) {
        TreeManager tm = new TreeManager();

        tm.add(new TreeNode(10));
        tm.add(new TreeNode(5));
        tm.add(new TreeNode(7));
        tm.add(new TreeNode(15));
        tm.add(new TreeNode(11));
        tm.add(new TreeNode(4));
        
        System.out.println("\nIn Order\n");
        tm.showInOrder();
        
        System.out.println("\nPre Order\n");
        tm.showPreOrder();
        
        System.out.println("\nPos Order\n");
        tm.showPosOrder();
        
        System.out.println("\nBreadth order \n");
        tm.showBreadth();
    }
}

