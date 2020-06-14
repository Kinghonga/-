/**
 * 动态数组底层实现，可构造多种类型的数组
 * @param <T>
 */
public class Array<T> {

    private T[] data;    //一个叫data的T型数组
    private int size;     //数组当前元素个数

    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data = (T[])new Object[capacity];
        size=0;
    }

    //无参数构造函数，默认数组的容量capacity=10
    public Array(){
        this(10 );
    }

    //获取数组的元素个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //判断数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //插入数据到指定索引位置
    public void add(int index,T element){

        if (index<0 || index>size)
            throw new IllegalArgumentException("add fail.Required index<0 || index>size");

        if (size==data.length)
            resize(2 * data.length);

        for (int i=size-1;i>=index;i--){
            data[i+1] = data[i];
        }

        data[index] = element;
        size ++;
    }

    //在数组最后添加一个新的元素
    public void addLast(T element){
        add(size,element);
    }

    public void addFirst(T element){
        add(0,element);
    }





    //根据索引删除该位置元素
    public T remove(int index){
        if (index<0 || index>=size)
            throw new IllegalArgumentException("Remove Fail.Index is illegal!");
        T ret =data[index];
        for (int i=index+1;i<size;i++)
            data[i-1] = data[i];
        size--;
        if (size == data.length/4 && data.length/2 != 0)
            resize(data.length/2);
        return ret;
    }

    //删除数组第一个元素
    public T removeFirst(){
        return remove(0);
    }

    //删除数组最后一个元素
    public T removeLast(){
        return remove(size-1);
    }


    //获取index索引位置的元素
    T get(int index){
        if (index<0 || index>=size)
            throw new IllegalArgumentException("Get Fail.Index is illegal!");
        return data[index];
    }

    //修改index索引位置的元素
    public void  set(int index,T element){
        if (index<0 || index>=size)
            throw new IllegalArgumentException("set Fail.Index is illegal!");
        data[index] = element;
    }

    //查找数组是否包含某元素
    public boolean contains(T element){
        for (int i=0;i<size-1;i++){
            if (data[i] == element)
                return true;
        }
        return false;
    }

    //查询数组中某个元素的索引
    public int find(T element){
        for (int i=0;i<size-1;i++){
            if (data[i] == element)
                return i;
        }
        return -1;
    }

    //根据值删除数组中某个元素(未解决同元素的情况)
    public void removeElement(T element){
        int index = find(element);
        if (index!=-1)
            remove(index);
    }


    private void resize(int newCapacity){
        T[] newData = (T[])new Object[newCapacity];
        for (int i=0;i<size;i++)
            newData[i] = data[i];
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d , capacity = %d\n",size,data.length));
        res.append('[');
        for (int i=0 ; i<size;i++){
            res.append(data[i]);
            if (i !=size-1)
                res.append(",");
        }
        res.append(']');

        return res.toString();

    }

}
