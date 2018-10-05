package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        long a = scanner.nextInt();
        System.out.println("The factorial of N is: " + factorial(a));
    }

    public static long factorial(long a) {
        if (a <= 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }
}
