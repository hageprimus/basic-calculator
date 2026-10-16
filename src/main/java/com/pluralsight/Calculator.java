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
        String menuPrompt = """
                            Possible calculations:
                            (A)dd:
                            (S)ubtract:
                            (M)ultiply:
                            (D)ivide:
                            Please select an option:""";
        System.out.println(menuPrompt);
        String calcSelect = myScanner.nextLine();

        switch (calcSelect) {
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
