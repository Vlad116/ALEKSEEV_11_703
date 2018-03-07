package Lists;

/* интерфейс, который описывает  какой-либо контейнер для хранения данных*/
public interface Collection<T> {
    void addToBegin(T element);

    void add(T element);

    void remove(T element);

    void reverse();

    boolean contains(T element);

    int size();
}