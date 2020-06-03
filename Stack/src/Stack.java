public interface Stack<T> {

    int getSize();
    boolean isEmpty();
    void push(T element);
    T pop();
    T peek();
}
