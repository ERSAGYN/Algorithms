package org.example.first;

import org.example.first.extra.MyLinkedList.MyLinkedList;
import org.example.first.extra.MyLinkedList.MyNode;

import java.util.LinkedList;

public class AssignmentLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> integers = new MyLinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        integers.add(11);
        //integers.setHead(middleNode(integers.getHead()));
        /*reverseList(integers);
        integers.printList();*/
        //System.out.println(nFromTail(integers, 3).getData());
        reverseListRecursive(integers, 0);
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

    public static void reverseListRecursive(MyLinkedList myLinkedList, int counter) {
        int temp = (Integer) myLinkedList.get(counter);
        myLinkedList.update(counter, myLinkedList.get(myLinkedList.getSize() - counter - 1));
        myLinkedList.update(myLinkedList.getSize() - counter - 1, temp);
        if(counter >= (myLinkedList.getSize()/2)-1) return;
        reverseListRecursive(myLinkedList, counter+1);
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

    public static int maxTwinSum(MyLinkedList myLinkedList){
        int counter = myLinkedList.getSize() - 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < myLinkedList.getSize() / 2; i++){
            max = Math.max(max, (Integer) myLinkedList.get(i) + (Integer) myLinkedList.get(counter));
            counter--;
        }
        return max;
    }

    public static MyNode nFromTail(MyLinkedList myLinkedList, int n){
        MyNode first = myLinkedList.getNode(n-1);
        MyNode last = myLinkedList.getHead();
        while(first != null && first.next != null) {
            first = first.next;
            last = last.next;
        }
        return last;
    }
}
