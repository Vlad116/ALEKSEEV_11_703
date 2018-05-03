package Lists;

/**
 * 15.02.2018
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class LinkedList<T> implements List<T> {


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
        Node current = head;
        int index = 0;
        while (current.next != null) {
            if (current.value.equals(element)) {
                return index;
            }
            index++;
        }

        return index;
    }

    @Override
    public T get(int index) {
        if (index >= count) {
            throw new IllegalArgumentException();
        }
        Node current = this.head;
        int i = 0;

        while (i < index) {
            current = current.next;
            i++;
        }

        return current.value;
    }


    // TODO: реализовать
    @Override
    public void addToBegin(T element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

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
        if (element == head.value) {
            head = head.next;
            return;
        }
        Node previous = head;

        for (Node node = head.next; node != tail; node = node.next) {
            if (node.value == element) {
                previous.next = node.next;
                return;
            }
            previous = node;
        }

        if (tail.value == element) {
            tail = previous;
            tail.next = null;
        }


    }

    // TODO: реализовать
    @Override
    public boolean contains(T element) {
        Node current = head;

        while (current.next != null) {
            if (element.equals(current.value)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public int size() {
        /*Node current = head;
        while(current.next != null) {
            count++;
            current = current.next;
        }
        return count;*/
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        return count;
    }

    public void reverse() {
        Node x = head;
        Node y = head.next;
        Node z = head.next != null ? head.next.next : null;
        while (z != null) {
            y.next = x;
            x = y;
            y = z;
            z = z.next;
        }
        y.next = x;
        LinkedList linkedList = new LinkedList();
    }


    /*public T[] toArray(){
        T[] array = new T[count];
        int i = 0;
        Node current = head;
        while(current.next != null){
            array[i] = current.value;
            current = current.next;
            i++;
        }
        return array;
    }*/

    public LinkedListStream stream() {
        LinkedListStream linkedListStream = new LinkedListStream(this);
        return linkedListStream;
    }


    private class LinkedListIterator implements Iterator<T> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T result = current.value;
            current = current.next;
            return result;
        }


    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    public static <E extends Comparable<E>> LinkedList merge(LinkedList<E> a, LinkedList<E> b) {
        LinkedList<E> newList = new LinkedList<>();
        Iterator<E> iteratorA = a.iterator();
        Iterator<E> iteratorB = b.iterator();

        E valueA = null;
        E valueB = null;

        while (iteratorA.hasNext() || iteratorB.hasNext()) {

            if (valueA == null && valueB == null) {
                valueA = iteratorA.hasNext() ? iteratorA.next() : null;
                valueB = iteratorB.hasNext() ? iteratorB.next() : null;
            }

            if (valueA != null && valueB != null && valueA.compareTo(valueB) == 0) {
                newList.add(valueA);
                newList.add(valueB);
                valueA = iteratorA.hasNext() ? iteratorA.next() : null;
                valueB = iteratorB.hasNext() ? iteratorB.next() : null;
            } else if (valueA != null && valueB != null && valueA.compareTo(valueB) < 0) {
                newList.add(valueA);
                valueA = iteratorA.hasNext() ? iteratorA.next() : null;
            } else {
                newList.add(valueB);
                valueB = iteratorB.hasNext() ? iteratorB.next() : null;
            }

        }
        return newList;
    }

    public class LinkedListStream {

        LinkedList<T> linkedList;

        public LinkedListStream(LinkedList<T> linkedList) {
            this.linkedList = linkedList;
        }


        LinkedListStream map(Function<T, T> function) {

            for (Node node = head; node != tail.next; node = node.next) {
                node.value = function.apply(node.value);
            }
            return this;
        }

        LinkedListStream filter(Predicate<T> predicate) {
            for (Node node = head; node != tail.next; node = node.next) {
                if (!predicate.test(node.value))
                    remove(node.value);
            }

            return this;
        }

        LinkedListStream sorted(Comparator<T> comparator) {
            ArrayList<T> arrayList = new ArrayList<>();
            for (Node node = head; node != tail.next; node = node.next)
                arrayList.add(node.value);
            arrayList.sort(comparator);
            int i = 0;
            for (Node node = head; node != tail.next; node = node.next) {
                node.value = arrayList.get(i);
                i++;
            }
            return this;
        }
    }

}