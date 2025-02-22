package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        double reversedNumber = 0;

        while (number != 0) {
            double digit = number % 10;
            reversedNumber = reversedNumber *10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed number" + reversedNumber);

    }
}

