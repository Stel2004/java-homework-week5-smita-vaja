package java_homework_week5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme_5_Iterator {

    public static void main(String[] args) {
        // Create a new ArrayList to store elements
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        // Create an Iterator to iterate through the ArrayList
        Iterator<Integer> iterator = numbersList.iterator();

        // Iterate and print each element using the Iterator
        System.out.println("ArrayList elements using Iterator:");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
