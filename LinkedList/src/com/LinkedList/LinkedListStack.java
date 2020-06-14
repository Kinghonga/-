package com.LinkedList;
import com.LinkedList.Stack;
public class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> linkedList;

    public LinkedListStack(){
        linkedList = new LinkedList<>();
    }

    @Override
    public  int getSize(){
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    @Override
    public void push(T element){
        linkedList.addFirst(element);
    }

    @Override
    public T pop(){
        return linkedList.removeFirst(linkedList.getSize()-1);
    }

    @Override
    public T peek(){
        return linkedList.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();
        sb.append("com.LinkedList.Stack:top ");
        sb.append(linkedList);
        return sb.toString();
    }
}
