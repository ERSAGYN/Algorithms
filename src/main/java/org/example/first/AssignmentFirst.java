package org.example.first;

public class AssignmentFirst {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        System.out.println(sumOfSquares(4));
        System.out.println(fibonacci(10));
        System.out.println(sumOfArray(3, new int[]{2,6,7,3,6,3,2,4,10}));
        System.out.println(sumOfPosInt(5));
        System.out.println(sumOfPowers(4,3));
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

    /*public static int maxValueOfArray(int[] array) {

    }*/
}
