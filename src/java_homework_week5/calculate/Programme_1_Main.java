package java_homework_week5.calculate;

import java.util.Scanner;

public class Programme_1_Main {

    // Declared main method
    public static void main(String[] args) {

        // Creating scanner class object to get user input
        Scanner scanner = new Scanner(System.in);
        Programme_1_Calculator obj = new Programme_1_Calculator();

        char choice = 'Y';
        // While loop used to check user choice to calculate again
        while((choice == 'Y') || (choice == 'y')) {
            System.out.println("Enter the first number:");
            int number1 = scanner.nextInt();

            System.out.println("Enter the second number:");
            int number2 = scanner.nextInt();

            System.out.println("Please enter one of symbol +,-,*, /:");
            Character symbol = scanner.next().charAt(0);

            // Method called
            obj.calculateResult(number1,number2, symbol);

            // To get user choice to calculate again
            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            choice = scanner.next().charAt(0);

        }
        // scanner class close
        scanner.close();
    }
}
