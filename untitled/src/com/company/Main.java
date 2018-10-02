package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer: ");

        //Capture input as an integer.
	int total = input.nextInt();
	total = ((total+5)*2)-7;
        System.out.println("Your total is: "+ total);
    }
}
