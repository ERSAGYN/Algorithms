package org.example.first.extra.HeapSort;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9,3,4,5,2,3,4,5,1,76,23};
        heapSort(arr);
        for (int i: arr) System.out.println(i);
    }


    public static void heapSort(int[] arr) {
        int length = arr.length;
        for(int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, length);
        }
        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }
    public static void heapify(int[] arr, int i, int length) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left < length && arr[left] > arr[largest]) largest = left;
        if(right < length && arr[right] > arr[largest]) largest = right;
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, length);
        }
    }
}
