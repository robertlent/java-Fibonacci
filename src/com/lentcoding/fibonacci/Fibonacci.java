package com.lentcoding.fibonacci;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int maxCount;

        try {
            System.out.println("This program prints the Fibonacci Sequence.\n");
            System.out.print("Enter the number of items that you would like printed from the sequence: ");
            maxCount = in.nextInt();
            BigInteger[] sequence = new BigInteger[maxCount];
            sequence[0] = BigInteger.ZERO;
            sequence[1] = BigInteger.ONE;

            for (int i = 2; i < maxCount; i++) {
                sequence[i] = sequence[i - 2].add(sequence[i - 1]);
            }

            System.out.println("\nFibonacci Sequence: ");
            display(sequence);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void display(BigInteger[] row) {
        for (BigInteger num : row) {
            System.out.println(num + " ");
        }
    }
}