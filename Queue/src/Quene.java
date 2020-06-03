public interface Quene<T> {

    //获取队列元素个数
    int getSize();
    //判断队列是否为空
    boolean isEmpty();
    //入队操作
    void enqueue(T element);
    //出队操作
    T dequeue();
    //获取队头元素
    T getFront();
}
