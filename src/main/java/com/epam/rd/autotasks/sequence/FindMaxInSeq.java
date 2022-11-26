package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt(); // Assigning first input as a max value, then we will compare with the rest

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break; // If it is zero, don't do any value assignment
            if (num > max) max = num; // Applying max selection algorithm
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
