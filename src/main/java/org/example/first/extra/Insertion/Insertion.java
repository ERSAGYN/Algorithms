package org.example.first.extra.Insertion;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = new int[]{9,32,54,3,2,1,45,5};
        insertion(arr);
        for (int i: arr) System.out.println(i);
    }
    public static void insertion(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] < temp) {
                int swap = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = swap;
                j--;
            }
        }
    }
}
