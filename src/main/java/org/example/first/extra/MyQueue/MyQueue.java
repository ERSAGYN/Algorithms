package org.example.first.extra.MyQueue;

import org.example.first.extra.MyLinkedList.MyLinkedList;

public class MyQueue<T> {
    private MyLinkedList<T> queueList;

    public MyQueue() {
        queueList = new MyLinkedList<T>();
    }

    public void offer(T element){
        queueList.addLast(element);
    }

    public T poll(){
        if(queueList.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return queueList.removeFirst();
    }

    public T peek(){
        if(queueList.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return queueList.getFirst();
    }

    public boolean empty(){
        return queueList.isEmpty();
    }

    public int size(){
        return queueList.getSize();
    }
}