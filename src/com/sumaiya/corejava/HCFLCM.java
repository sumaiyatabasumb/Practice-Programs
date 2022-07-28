package com.sumaiya.corejava;

import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        int temp1, temp2, num1, num2, temp, hcf, lcm;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        input.close();

        temp1 = num1;
        temp2 = num2;

        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        hcf = num1;
        lcm = (num1 * num2) / hcf;

        System.out.println("HCF value is: " + hcf);
        System.out.println("LCM value is: " + lcm);

    }
}
