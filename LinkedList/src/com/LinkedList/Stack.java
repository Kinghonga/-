package com.LinkedList;

public interface Stack<T> {
    /**
     *
     * 栈：先进后出
     * 栈的接口包含：getSzie获取元素个数
     *              isEmpty判断是否为空
     *              push元素入栈操作
     *              pop栈顶元素出栈操作，元素被删除
     *              peek返回栈顶元素，元素不删除
     * @return
     */
    int getSize();
    boolean isEmpty();
    void push(T element);   //push是入栈操作
    T pop();        //pop是让栈顶元素出栈
    T peek();     //peek是获取顶元素
}
