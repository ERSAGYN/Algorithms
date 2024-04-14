package org.example;

import org.example.first.extra.MyLinkedList.MyLinkedList;
import org.example.first.extra.MyLinkedList.MyNode;

import java.util.LinkedList;
import java.util.Queue;
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
        //System.out.println(bracketsValid("{(()())[]}"));
        int[] arr = new int[]{8,4,6,2,3};
        heapify2(arr, arr.length, 0);
        for (int i: arr) System.out.println(i);

    }

    public static void heapify(int[] arr, int i) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;
        if(left < arr.length && arr[left] > arr[largest]) largest = left;
        if(right < arr.length && arr[right] > arr[largest]) largest = right;
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest);
        }
    }

    static void heapify2(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && a[l] > a[largest]) largest = l;
        if (r < n && a[r] > a[largest]) largest = r;
        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify2(a, n, largest);
        }
    }


    /*public static int hungryStudents(boolean students[], boolean doners[]) {
        Queue<Boolean> studentsList = new LinkedList<>();
        Queue<Boolean> donersList = new LinkedList<>();
        for(boolean i: students) studentsList.add(i);
        for(boolean i: doners) donersList.add(i);

        if(studentsList.peek() == donersList.peek())
    }*/

    public static boolean bracketsValid(String s) {
        Stack<Character> brackets = new Stack<>();
        char checkBracket = ' ';
        for (int i = 0; i < s.length(); i++) {
            brackets.add(s.charAt(i));
            if(brackets.peek() == checkBracket + 1 || brackets.peek() == checkBracket + 2) {
                brackets.pop();
                brackets.pop();
            }
            if(!brackets.isEmpty()) checkBracket = brackets.peek();
        }
        return brackets.isEmpty();
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
