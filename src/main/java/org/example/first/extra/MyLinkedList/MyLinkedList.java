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

    public void addFirst(T value){
        MyNode<T> temp = new MyNode<>(value);
        temp.next = head;
        head = temp;
        size++;
    }

    public void addLast(T value) {
        MyNode<T> newNode = new MyNode<>(value);

        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    public T getFirst(){
        return head.getData();
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

    public T removeFirst() {
        T temp = null;
        if (head == tail) {
            head = tail = null;
        } else {
            temp = head.getData();
            head = head.next;
        }
        size--;
        return temp;
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

    public boolean isEmpty(){
        return getSize()==0;
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
