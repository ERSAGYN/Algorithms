package org.example.first.extra.MyLinkedList;

public class MyNode<E> {
    E data;
    public MyNode<E> next;
    public MyNode<E> prev;
    MyNode(E data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
