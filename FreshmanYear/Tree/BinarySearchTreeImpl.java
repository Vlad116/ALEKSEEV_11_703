package Tree;

import OptimizationOfTheTree.TreeBalancer;

import java.util.*;

/*
* 04.04.2018
* BinarySearchTreeImpl
*
* @author Sidikov Marsel (First Software Engineering Platform)
* @version v1.0
*/
public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {

    private class TreeNode {
        private T value;
        private TreeNode left;
        private TreeNode right;
        private TreeNode parent;

        public TreeNode(T value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public BinarySearchTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(T element) {
        this.root = insert(root, element);
    }

    private TreeNode insert(TreeNode root, T element) {
        if (root == null) {
            root = new TreeNode(element);
        } else if (root.value.compareTo(element) >= 0) {
            root.left = insert(root.left, element);
            root.left.parent = root;
        } else {
            root.right = insert(root.right, element);
            root.right.parent = root;

        }
        return root;
    }

    @Override
    public void remove(T element) {
        remove(root, element);
    }

    private void remove(TreeNode root, T element) {
        TreeNode toRemove = findNode(this.root, element);
        TreeNode replacement = toRemove.left != null ? toRemove.left : toRemove.right;
        if (replacement == toRemove.left) {
            while (replacement.right != null) replacement = replacement.right;
            toRemove.value = replacement.value;
            deleteNode(replacement);
        } else {
            replacement.parent.right = null;
            replacement.parent = null;
            this.root = replacement;
        }
    }

    private void deleteNode(TreeNode toDelete) {
        if (toDelete.left == null) {
            toDelete.parent.right = null;
        } else {
            toDelete.parent.right = toDelete.left;
            toDelete.left.parent = toDelete.parent;
        }
        toDelete.parent = null;
    }

    private TreeNode findNode(TreeNode root, T element) {
        TreeNode flag = null;
        if (root != null) {
            if (root.value.compareTo(element) == 0) {
                flag = root;
                return flag;
            }
            flag = findNode(root.left, element);
            if (flag != null) return flag;
            flag = findNode(root.right, element);
        }
        return flag;
    }

    @Override
    public boolean contains(T element) {
        TreeNode current = root;
        int resultCompare;
        boolean theElementIsFound = false;
        while (current != null && !theElementIsFound) {
            resultCompare = current.value.compareTo(element);
            if (resultCompare > 0) {
                current = current.left;
            } else if (resultCompare < 0) {
                current = current.right;
            } else {
                theElementIsFound = true;
            }
        }
        return theElementIsFound;
//        return findNode(root, element) != null;
    }

    @Override
    public void print() {
        print(this.root);
    }

    private void print(TreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    public int getHeight(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

    public void printByLevels() {
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        printByLevels(list, getHeight(root));
    }

    private void printByLevels(List<TreeNode> levelNodes, int level) {

        List<TreeNode> nodes = new ArrayList<>();

        printIndentForLevel(level);

        for (TreeNode treeNode : levelNodes) {
            System.out.print(treeNode == null ? " " : treeNode.value);
            printSpacingBetweenNodes(level);
            if (level > 1) {
                if (treeNode != null) {
                    nodes.add(treeNode.left);
                }
                if (treeNode != null) {
                    nodes.add(treeNode.right);
                }
            }
        }
        System.out.println();

        if (level > 1) {
            printByLevels(nodes, level - 1);
        }
    }

    private void printIndentForLevel(int level) {
        for (int i = (int) Math.pow(2, (level)) - 1; i > 0; i--) {
            System.out.print(" ");
        }
    }

    private void printSpacingBetweenNodes(int level) {
        //spacing between nodes
        for (int i = (int) Math.pow(2, (level + 1)) - 1; i > 0; i--) {
            System.out.print(" ");
        }
    }

}