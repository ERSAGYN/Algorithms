package org.example.first;

import org.example.first.extra.MyLinkedList.MyLinkedList;
import org.example.first.extra.MyLinkedList.MyNode;

import java.util.LinkedList;

public class AssignmentLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> integers = new MyLinkedList<>();
        integers.add(1);
        integers.add(5);
        integers.add(5);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(5);
        integers.add(87);
        integers.add(65);
        integers.add(5);
        integers.add(6);
        //integers.setHead(middleNode(integers.getHead()));
        /*reverseList(integers);
        integers.printList();*/
        removeDuplicates(integers);
        integers.printList();
    }

    public static MyNode middleNode(MyNode head) {
        MyNode fast = head;
        MyNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void reverseList(MyLinkedList myLinkedList) {
        int counter = myLinkedList.getSize() - 1;
        for (int i = 0; i < myLinkedList.getSize() / 2; i++){
            int temp = (Integer) myLinkedList.get(i);
            myLinkedList.update(i, myLinkedList.get(counter));
            myLinkedList.update(counter, temp);
            counter--;
        }
    }

    public static void removeNodes(MyLinkedList myLinkedList, int value) {
        int counter = 0;
        while (myLinkedList.remove(value)) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void removeDuplicates(MyLinkedList integers){
        for (int i = 0; i < integers.getSize(); i++){
            for (int j = 0; j < integers.getSize(); j++){
                if(i == j){
                    continue;
                }
                if (integers.get(i) == integers.get(j)) {
                    integers.removeByIndex(j);
                }
            }
        }
    }
}
