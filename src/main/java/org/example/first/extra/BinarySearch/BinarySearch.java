package org.example.first.extra.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Your number is " + findNumberBinary(1,100));
    }
    public static int findNumberBinary(int start, int end) {
        if(start == end) return start;
        Scanner scanner = new Scanner(System.in);
        int mid = (end+start)/2;
        System.out.println("Is your number greater than " + mid);
        switch(scanner.nextLine()) {
            case "YES":
                return findNumberBinary(mid + 1, end);
            case "NO":
                return findNumberBinary(start, mid);
            default:
                System.out.println("You must enter only YES or NO answers!");
                return findNumberBinary(start, end);
        }
    }
}
