package Lists;

/**
 * Реализация списка на основе узлов ()
 */

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

    public static <E extends Comparable<E>> LinkedList merge(LinkedList<E> a, LinkedList<E> b) {
        if (a.head == null) {
            return b;
        } else if (b.head == null) {
            return a;
        }
        Iterator<E> iteratorA = a.iterator();
        Iterator<E> iteratorB = b.iterator();
        LinkedList<E> merged = new LinkedList<>();
        E currentPairA = iteratorA.next();
        E currentPairB = iteratorB.next();
        do {
            if (currentPairA.compareTo(currentPairB) < 0) {
                merged.add(currentPairA);
                currentPairA = iteratorA.next();
            } else {
                merged.add(currentPairB);
                currentPairB = iteratorB.next();
            }
        } while (iteratorA.hasNext() && iteratorB.hasNext());
        if (iteratorA.hasNext()) {
            merged.add(currentPairA);
            while (iteratorA.hasNext()) {
                merged.add(iteratorA.next());
            }
        } else {
            merged.add(currentPairB);
            while (iteratorB.hasNext()) {
                merged.add(iteratorB.next());
            }
        }
        return merged;
    }

    private class LinkedListIterator implements Iterator<T> {
        // указывает на текущий узел
        private Node currentNode;

        public LinkedListIterator() {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T result = currentNode.value;
            currentNode = currentNode.next;
            return result;
        }
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int count;

    public LinkedList() {
        this.count = 0;
    }

    @Override
    public int indexOf(T element) {
        Node currentNode = head;
        for (int index = 0; index < count; index++) {
            if (currentNode.value.equals(element)) {
                return index;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (index >= count) {
            throw new IllegalArgumentException();
        }
        Node currentNode = this.head;
        int i = 0;
        while (i < index) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.value;
//        Node currentElement = head;
//        for (int current = 0; current < index; current++) {
//           currentElement = currentElement.next;
//        }
//        return currentElement.value;*/
    }

    // TODO: реализовать
    @Override
    public void addToBegin(T element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        count++;
    }

    @Override
    public void add(T element) {
//        Node newNode = new Node(element);
//
//        if (head == null) {
//            head = newNode;
//        } else {
//            // создаем переменную, которая указывает
//            //  на начало списка
//            Node current = head;
//            // пока следующий после текущего есть
//            while (current.next != null) {
//                // идем дальше
//                current = current.next;
//            }
//            current.next = newNode;
//        }
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    @Override
    public void remove(T element) {
        count--;
        //если list уже пустой
        if (head == null) return;
        //если один элемент в liste, все зануляем
        if (head == tail) {
            head = null;
            tail = null;
            count = 0;
            return;
        }
        //если искомый элемент - первый
        if (head.value.equals(element)) {
            Node newNode = new Node(element);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            count++;
            head = head.next;
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.next.value == element) {
                if (tail == currentNode.next) {
                    tail = currentNode;
                }
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void reverse() {
        LinkedList list = new LinkedList();
        Node currentNode = head;
        while (currentNode.next != null) {
            list.addToBegin(currentNode.value);
            currentNode = currentNode.next;
        }
        list.addToBegin(currentNode.value);
        head = list.head;
        count = list.count;
    }

    // TODO: реализовать
    @Override
    public boolean contains(T element) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        if (currentNode.value.equals(element)) {
            return true;
        }
        return false;
    }

    @Override
    public void showList() {
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.value + " ");
        System.out.println();
    }

    @Override
    public int size() {
        return count;
    }
}