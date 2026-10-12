package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double finalResult = 0;
        boolean passedSwitch = false;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = myScanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = myScanner.nextDouble();

        myScanner.nextLine();
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd: ");
        System.out.println("(S)ubtract: ");
        System.out.println("(M)ultiply: ");
        System.out.println("(D)ivide: ");
        System.out.println("Please select an option: ");
        String calcSelect = myScanner.nextLine();

        switch (calcSelect){
            case "A", "a":
                passedSwitch = true;
                finalResult = num1 + num2;
                break;
            case "S", "s":
                passedSwitch = true;
                finalResult = num1 - num2;
                break;
            case "M", "m":
                passedSwitch = true;
                finalResult = num1 * num2;
                break;
            case "D", "d":
                if (num2 != 0) {
                    passedSwitch = true;
                    finalResult = num1 / num2;
                } else {
                    System.out.println("Cannot divide by 0!");
                }
                break;
            default:
                System.out.println("Please enter a valid input!");
                break;
        }
        if (passedSwitch) {
            System.out.println("Final result: " + finalResult);
        }
    }
}
