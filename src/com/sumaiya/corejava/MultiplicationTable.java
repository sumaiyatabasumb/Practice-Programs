package com.sumaiya.corejava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for which multiplication table needs to be printed: ");
        int multiplicationNumber = input.nextInt();

        System.out.print("Enter the range till which the table needs to be printed: ");
        int range = input.nextInt();

        //Call multiplicationtable function
        multiplicationTable(multiplicationNumber, range);
    }

    private static void multiplicationTable(int multiplicationNumber, int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(multiplicationNumber + " * " + i + " = " + multiplicationNumber * i);

            //Output will be - for 7th table with range 10
            //7 * 1 = 7
            //7 * 2 = 14
            //7 * 3 = 21
            //7 * 4 = 28
            //7 * 5 = 35
            //7 * 6 = 42
            //7 * 7 = 49
            //7 * 8 = 56
            //7 * 9 = 63
            //7 * 10 = 70
        }

    }
}
