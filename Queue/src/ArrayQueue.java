public class ArrayQueue<T> implements Quene<T>{

    /**
     * 数组队列
     */


    private Array<T> array;

    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayQueue(){
        array = new Array<>();
    }


    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(T element) {
        array.addLast(element);
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public T dequeue() {
        return array.removeFirst();
    }

    @Override
    public T getFront() {
        return array.get(0);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for (int i=0 ; i<array.getSize();i++){
            res.append(array.get(i));
            if (i !=array.getSize()-1)
                res.append(",");
        }
        res.append("] tail");
        return res.toString();

    }
}
