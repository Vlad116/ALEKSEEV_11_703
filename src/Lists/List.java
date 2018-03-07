package Lists;

/*
 * Частный случай коллекции, гарантирует определеннй порядок элементов
*/
public interface List<T> extends Collection<T>, Iterable<T> {
    void showList();

    int indexOf(T element);

    T get(int index);
}
