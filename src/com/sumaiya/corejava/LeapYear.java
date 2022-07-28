package com.sumaiya.corejava;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        //Call the leap year function
        IsLeap();
    }

    static void IsLeap() {
        Scanner input = new Scanner(System.in);

        //take input
        System.out.print("Enter a year: ");
        int leap = input.nextInt();

        boolean isleap = false;

        if (leap % 4 == 0) {
            if (leap % 100 == 0) {
                if (leap % 400 == 0) {
                    isleap = true;
                }
                isleap = false;
            }
            isleap = true;
        }

        if (isleap == false) {
            System.out.println("The entered year is NOT a leap year");
        }

        else {
            System.out.println("The entered year is a leap year");
        }
    }
}
