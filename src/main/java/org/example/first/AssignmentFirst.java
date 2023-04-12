package org.example.first;

import java.util.Arrays;
import java.util.Scanner;


public class AssignmentFirst {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        /*System.out.println(sumOfSquares(4));
        System.out.println(fibonacci(10));
        System.out.println(sumOfArray(3, new int[]{2,6,7,3,6,3,2,4,10}));
        System.out.println(sumOfPosInt(5));
        System.out.println(sumOfPowers(4,3));
        System.out.println(maxValueOfArray(new int[]{2,6,7,3,6,17,2,4,10}));
        System.out.println(GCD(36, 48));
        reverseSequence(3);
        reverseSequenceStrings(3);
        System.out.println(sumOfDigits(777));*/
        int[] array = {5,6,3,2,1,6};
        bubbleSort(array , 6);
        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static int sumOfSquares(int num) {
        if (num == 1) return 1;
        return num*num + sumOfSquares(num-1);
    }

    public static int fibonacci(int n) {
        if(n == 1 || n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int sumOfArray(int n, int[] array) {
        if (n == 1) return array[0];
        return array[n-1] + sumOfArray(n-1, array);
    }

    public static int sumOfPosInt(int n) {
        if (n == 1) return 1;
        return n + sumOfPosInt(n-1);
    }

    public static int sumOfPowers(int b, int n) {
        if (n == 0) return 1;
        return (int)Math.pow(b,n) + sumOfPowers(b, n-1);
    }

    public static int maxValueOfArray(int[] array) {
        if (array.length == 1) return array[0];
        return Math.max(array[array.length-1], maxValueOfArray(Arrays.copyOf(array, array.length - 1)));
    }

    public static int GCD(int a, int b) {
        int reminder = Math.max(a,b) % Math.min(a,b);
        return reminder == 0 ? Math.min(a,b) : GCD(Math.min(a,b), reminder);
    }

    public static void reverseSequence(int n) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (n == 1) {
            System.out.println(num);
            return;
        }
        reverseSequence(n-1);
        System.out.println(num);
    }

    public static void reverseSequenceStrings(int n) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (n == 1) {
            System.out.println(str);
            return;
        }
        reverseSequenceStrings(n-1);
        System.out.println(str);
    }

    /*public static String reverseSequenceStrings2(int n) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (n == 1) return str;
        String str2 = reverseSequenceStrings2(n-1);
        System.out.println(str2);
        return str2;
    }*/

    public static int sumOfDigits(int num) {
        if(num / 10 < 1) return num;
        return num%10 + sumOfDigits(num/10);
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
