package Maps;

/**
 * 15.03.2018
 * HashMapImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HashMapImpl<K, V> implements Map<K, V> {

    class Node<Key, Value> {
        Key key;
        Value value;
        Node next;
        Node last;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

    }

    private Node<K, V> map[];

    public HashMapImpl() {
//        map = (Node[])new Object[10];
        map = new Node[10];
    }

    @Override
    public void put(K key, V value) {
        int position = Math.abs(key.hashCode() % 10);
        if (map[position] == null) {
            map[position] = new Node(key, value);
            map[position].last = map[position];
        } else {
            Node currentNode = map[position];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    break;
                }
                currentNode = currentNode.next;
            }
            map[position].last.next = new Node(key, value);
            map[position].last = map[position].last.next;
        }
    }

    @Override
    public V get(K key) {
        int position = Math.abs(key.hashCode() % 10);
        if (map[position] == null)
            return null;
        Node currentNode = map[position];
        while (currentNode != null) {
            if (key.equals((K) currentNode.key)) {
                return (V) currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
}