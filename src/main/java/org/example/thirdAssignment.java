package org.example;

import org.example.first.extra.MyLinkedList.MyLinkedList;
import org.example.first.extra.MyLinkedList.MyNode;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class thirdAssignment {
    public static void main(String[] args) {
        /*for (int i: first()) {
            System.out.println(i);
        }*/
        Stack<Integer> stack = new Stack();
        //for (int i = 0; i  < 5; i++) stack.add(i);
        //for (int i: stackReverseRecursion(stack, new Stack())) System.out.println(i);
        //System.out.println(brackets("([(]))"));
        second(new int[]{8,4,6,2,3}).printList();

    }

    public static void heapify(int[] arr, int i) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;
        if(left < arr.length && arr[left] > arr[i]) largest = left;
        if(right < arr.length && arr[right] > arr[largest]) largest = right;
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest);
        }
    }

    public static boolean brackets(String s) {
        int parenthesesCount = 0, curlyCount = 0, squareCount = 0;
        boolean isValid;
        for (int i = 0; i < s.length(); i++) {
            if(parenthesesCount < 0 || curlyCount < 0 || squareCount < 0) break;
            if (s.charAt(i) == '(') parenthesesCount++;
            if (s.charAt(i) == ')') parenthesesCount--;
            if (s.charAt(i) == '{') curlyCount++;
            if (s.charAt(i) == '}') curlyCount--;
            if (s.charAt(i) == '[') squareCount++;
            if (s.charAt(i) == ']') squareCount--;
        }
        return parenthesesCount == 0 && curlyCount == 0 && squareCount == 0;
    }

    public static Stack<Integer> stackReverseRecursion(Stack stack, Stack reversed) {
        if(stack.isEmpty()) return reversed;
        reversed.add(stack.pop());
        return stackReverseRecursion(stack, reversed);
    }

    public static MyLinkedList<Integer> second(int[] prices) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for(int i: prices) {
            linkedList.add(i);
        }
        MyNode currentNode = linkedList.getHead();
        MyNode checkNode = linkedList.getHead();
        while(checkNode.next != null) {
            if((int)currentNode.getData() >= (int)checkNode.getData() && currentNode != checkNode) {
                currentNode.setData((int)currentNode.getData() - (int)checkNode.getData());
                currentNode = currentNode.next;
                checkNode = currentNode;
            }
            else {
                checkNode = checkNode.next;
            }
        }
        return linkedList;
    }

    public static LinkedList<Integer> first() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        int operations = scanner.nextInt();
        while(true) {
            if(operations == 0) break;
            switch (scanner.nextInt()) {
                case 1:
                    linkedList.addFirst(scanner.nextInt());
                    break;
                case 2:
                    linkedList.addLast(scanner.nextInt());
                    break;
                case 3:
                    result.add(linkedList.removeFirst());
                    break;
                case 4:
                    result.add(linkedList.removeLast());
                    break;
            }
            operations--;
        }
        return result;
    }
}
