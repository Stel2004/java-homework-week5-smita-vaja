package java_homework_week5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {

    public static void colourArrayList(int length){
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        // Create a new ArrayList to store colors
        ArrayList<String> colorsList = new ArrayList<>();

        for (int i = 0; i< length; i++){
            System.out.println("Enter the colour you want to add into colourList: ");
            String colorName = scanner.nextLine();
            // Add some colors to the ArrayList
            colorsList.add(colorName);
        }

        // Print out the collection using foreach loop
        System.out.println("Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of integer array: ");
        int arrLength = Integer.parseInt(scanner.nextLine());


        // Called method
        colourArrayList(arrLength);
    }
}
