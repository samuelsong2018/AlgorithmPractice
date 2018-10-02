package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Enter your first test score: ");
        double num01 = input.nextDouble();

        System.out.println("Enter your second test score: ");
        double num02 = input.nextDouble();

        System.out.println("Enter your third test score: ");
        double num03 = input.nextDouble();

        System.out.println("Enter your fourth test score: ");
        double num04 = input.nextDouble();

        System.out.println("Enter your fifth test score: ");
        double num05 = input.nextDouble();

        System.out.println("Enter your sixth test score: ");
        double num06 = input.nextDouble();

        System.out.println("Enter your seventh test score: ");
        double num07 = input.nextDouble();

        System.out.println("Enter your eighth test score: ");
        double num08 = input.nextDouble();

        System.out.println("Enter your ninth test score: ");
        double num09 = input.nextDouble();

        System.out.println("Enter your tenth and final test score: ");
        double num10 = input.nextDouble();

        double total = num01+num02+num03+num04+num05+num06+num07+num08+num09+num10;
        double average = total/10;
        System.out.println("Your test average is: \n"+average);

    }
}
