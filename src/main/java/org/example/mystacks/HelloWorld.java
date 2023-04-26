package org.example.mystacks;

import org.example.first.extra.MyLinkedList.MyLinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HelloWorld {
    public static void main(String[] args) {
        /*Stack stack = new Stack();
        stack.push(5);
        stack.push(12);
        stack.push(9);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());*/

        /*Queue queue = new LinkedList();
        queue.add("Almat");
        queue.add("Bireu");
        queue.add("TagyBireu");
        queue.add("UshinshiBireu");
        queue.add("Aizhan");
        System.out.println(queue.poll());*/
        int[] arr = {3,6,9,15,8,4,7};
        for (int i = arr.length - 1; i >= 0; i--) {
            heapify(arr, i);
        }

        for(int i: arr) {
            System.out.println(i);
        }
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
}
