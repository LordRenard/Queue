public interface Queue<T> {
    T pop();
    void push(T item);
    T peek();
    int size();
    boolean isEmpty();
}
