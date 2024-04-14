package org.example.first.extra.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,32,54,3,2,1,45,5};
        selectionSort(arr);
        for (int i: arr) System.out.println(i);
    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[i]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
}
