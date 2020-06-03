import java.util.SplittableRandom;

public class ArrayStack<T> implements Stack<T>{

    Array<T> array;

    //有参构造函数
    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    //无参数构造函数
    public ArrayStack(){
        array = new Array<>();
    }

    @Override
    public int getSize(){
        return array.getSize();
    }

    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("[");
        for (int i=0;i<array.getSize();i++){
            res.append(array.get(i));
            if (i!=array.getSize()-1)
                res.append(",");
        }

        res.append("] top");
        return res.toString();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public void push(T element){
        array.addLast(element);
    }


    @Override
    public T pop(){
        return array.removeLast();
    }


    @Override
    public T peek(){
        return array.getLast();
    }
}
