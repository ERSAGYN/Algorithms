package org.example.first.extra.MyStack;

import org.example.first.extra.MyLinkedList.MyLinkedList;

public class MyStack<T> {
    private MyLinkedList<T> stackList;

    public MyStack() {
        stackList = new MyLinkedList<T>();
    }

    public void push(T element){
        stackList.addFirst(element);
    }

    public T pop(){
        if(stackList.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return stackList.removeFirst();
    }

    public T peek(){
        if(stackList.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return stackList.getFirst();
    }

    public boolean empty(){
        return stackList.isEmpty();
    }

    public int size(){
        return stackList.getSize();
    }
}