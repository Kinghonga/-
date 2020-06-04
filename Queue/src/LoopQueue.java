public class LoopQueue<T> implements Quene<T> {

    private T[] data;


    private int front,tail;  //front头指针，若队列不为空，指向队头元素    tail尾指针，若队列不为空，指向队列尾元素的下一个位置
    private int size;       //循环队列的元素个数

    public LoopQueue(int capacity){
        data = (T[])new Object[capacity+1];   //循环队列有意浪费一个位置用来计算
        front=0;
        tail=0;
        size=0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length-1;
    }

    @Override
    public  boolean isEmpty(){
        return front == tail;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void enqueue(T element){
        if((tail+1) % data.length == front){
            resize(getCapacity()*2);  //扩容
        }
    }

    private void resize(int newCapacity){
        T[] newData = (T[])new Object[newCapacity+1];
        for (int i=0;i<size;i++)
            newData[i] = data[(i+front)%data.length+1];

        data = newData;
        front=0;
        tail=size;
    }



    @Override
    public T dequeue() {
        if (isEmpty())
            throw  new IllegalArgumentException("Cannot dequeue from an empty queue.");

        T ret = data[front];
        data[front] = null;
        front = (front+1) % data.length;
        size --;

        if (size == getCapacity() /4  && getCapacity() /2 !=0)
            resize(getCapacity() /2);
        return ret;
    }

    @Override
    public T getFront() {
        if (isEmpty())
            throw  new IllegalArgumentException("Queue is empty");

        return data[front];
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue:size=%d,capacity = %d\n",size,getCapacity()));
        res.append("front [");
        for (int i=front ; i!=tail;i=(i+1)%data.length){
            res.append(data[i]);
            if ((i+1) % data.length != tail)
                res.append(",");
        }
        res.append("] tail");
        return res.toString();


    }

}
