package Tree;

public interface BinarySearchTree<T extends Comparable> {
    void insert(T element);

    void remove(T element);

    boolean contains(T element);

    void print();

    void printByLevels();

}
