package me.samuel;

import java.util.Scanner;

public class Main {

    //Ask for first integer.
     public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
     System.out.println("Enter your first integer: ");
     int num1 = input.nextInt();

        //Ask for second integer.
         System.out.println("Enter your second integer: ");
         int num2 = input.nextInt();

         //Ask for third integer.
         System.out.println("Enter your third and final integer: ");
         int num3 = input.nextInt();

         //Add and print total.
         int total = num1+num2+num3;
         System.out.println("The sum of these three integers is: "+total);
    }
}
