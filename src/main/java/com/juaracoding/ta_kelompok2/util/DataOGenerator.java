package com.juaracoding.ta_kelompok2.util;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 27/05/2024 20:05
@Last Modified 27/05/2024 20:05
Version 1.0
*/

import java.util.Scanner;

public class DataOGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Print the number "1" repeatedly based on the input
        for (int i = 0; i < num; i++) {
            System.out.print("1");
            if (i < num - 1) {  // Add comma for all except the last number
                System.out.print(",");
            }
        }
        System.out.println();  // Print a newline after each iteration
    }
}
