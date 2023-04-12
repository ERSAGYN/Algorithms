package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public static int countZeros(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                counter++;
            }
        }
        return counter;
    }
}