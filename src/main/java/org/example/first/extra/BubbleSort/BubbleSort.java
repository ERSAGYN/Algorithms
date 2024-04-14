package org.example.first.extra.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {

    }
    public static void bubbleSort(int[] array, int n) {
        if(n == 0) return;
        for (int j = 0; j < array.length - 1; j++) {
            if(array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        bubbleSort(array, n-1);
    }
}
