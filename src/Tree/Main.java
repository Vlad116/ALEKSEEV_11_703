package Tree;

public class Main {
    public static void main(String[] args) {
        int array[] = {6, 2, 8, -3, 5, 12, 4, 9};

        BinarySearchTree<Integer> tree = new BinarySearchTreeImpl<>();

        for (int element : array) {
            tree.insert(element);
        }
        int i = 1;
        System.out.println(tree.contains(5));
        System.out.println(tree.contains(3));
        tree.print();
        System.out.println();
        tree.printByLevels();
        tree.remove(6);
        //tree.remove(6);
        //tree.remove(12);
        System.out.println();
        tree.printByLevels();
//	    TreeNode a = new TreeNode(6);
//	    TreeNode b = new TreeNode(2);
//	    TreeNode c = new TreeNode(8);
//	    TreeNode d = new TreeNode(-3);
//	    TreeNode e = new TreeNode(5);
//	    TreeNode f = new TreeNode(12);
//	    TreeNode g = new TreeNode(4);
//	    TreeNode h = new TreeNode(9);
//
//	    a.setLeft(b);
//	    a.setRight(c);
//	    b.setLeft(d);
//	    b.setRight(e);
//	    e.setLeft(g);
//	    c.setRight(f);
//	    f.setLeft(h);
    }
}