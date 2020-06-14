package com.LinkedList;

public class Main {



    public static void main(String[] args) {
//        com.LinkedList.LinkedList<Integer> linkedList = new com.LinkedList.LinkedList<>();
//        for (int i=0;i<5;i++){
//            linkedList.addFirst(i);
//            System.out.println(linkedList);
//        }

        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i=0;i<5;i++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);

    }
}
