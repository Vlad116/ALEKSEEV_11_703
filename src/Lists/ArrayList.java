package Lists;

/**
 * 15.02.2018
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Реализация списка на основе массива
 */

import java.util.Iterator;

public class ArrayList<T> implements List<T> {

    private static final int DEFAULT_SIZE = 10;

    private T elements[];

    private int count;

    public ArrayList() {
        this.elements = (T[]) (new Object[DEFAULT_SIZE]);
        this.count = 0;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < count; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        } else throw new IllegalArgumentException();
    }

    @Override
    public void addToBegin(T element) {
        if (count == DEFAULT_SIZE) {
            this.elements = (T[]) (new Object[DEFAULT_SIZE + DEFAULT_SIZE / 2]);
        }
        count++;
        if (elements[0] == null) {
            elements[0] = element;
            return;
        }

        T pass = elements[0];

        for (int i = 1; i < count + 1; i++) {
            elements[0] = elements[count];
            elements[i] = pass;
            pass = elements[0];
        }
        elements[0] = element;
    }

    @Override
    public void add(T element) {
        if (count < elements.length) {
            this.elements[count++] = element;
        } else {
            this.elements = (T[]) (new Object[DEFAULT_SIZE + DEFAULT_SIZE / 2]);
            this.elements[count++] = element;
        }
    }

    @Override
    public void remove(T element) {
        int i = 0;
        if (elements[count - 1] == element) {
            elements[count - 1] = null;
            return;
        }
        while (elements[i] != element) {
            i++;
        }
        for (int j = i; j < count - 1; j++) {
            elements[j] = elements[j + 1];
        }
        count--;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < elements.length / 2; i++) {
            T pass = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = elements[i];
        }
    }

    @Override
    public void showList() {
        for (Object object : elements) {
            System.out.println(object + " ");
        }
        System.out.println();
    }

    @Override
    public boolean contains(T element) {
        for (T object : elements) {
            if (object == element) return true;
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    // Вложенный класс
    private class ArrayListIterator implements Iterator<T> {
        // указывает на текущий индекс
        private int currentIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            T result = elements[currentIndex];
            currentIndex++;
            return result;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }
}