package org.example.first.extra.MyLinkedList;

import java.lang.invoke.MutableCallSite;

public class MyLinkedList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T newItem) {
        MyNode<T> newNode = new MyNode(newItem);
        if(head == null) {
            head = tail = newNode;
        } else {
            MyNode temp = tail;
            temp.next = newNode;
            tail = newNode;
            tail.prev = temp;
        }
        size++;
    }

    public boolean remove(T removeItem) {
        MyNode<T> currentNode = head;
        if(head.data == removeItem) {
            head = head.next;
            size--;
            return true;
        }
        while(currentNode.next.data != removeItem) {
            if(currentNode.next.next == null) {
                return false;
            }
            currentNode = currentNode.next;

        }

        currentNode.next = currentNode.next.next;
        size--;
        return true;
    }
    public  void removeByIndex(int index){
        MyNode<T> currentNode = head;
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        for(int i = 0; i<index-1;i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        size--;
    }

    public T get(int index) {
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current.data;
    }

    public MyNode<T> getNode(int index) {
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public MyNode<T> getHead() {
        return head;
    }

    public void setHead(MyNode<T> head) {
        this.head = head;
    }

    public MyNode<T> getTail() {
        return tail;
    }

    public void setTail(MyNode<T> tail) {
        this.tail = tail;
    }

    public void printList() {
        MyNode tempHead = head;
        while(tempHead != null) {
            System.out.println(tempHead.getData());
            tempHead = tempHead.next;
        }
    }

    public void update(int index, T value) {
        MyNode currentNode = head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        currentNode.data = value;
    }

    public int getSize() {
        return size;
    }
}
