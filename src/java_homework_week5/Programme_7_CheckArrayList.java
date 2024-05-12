package java_homework_week5;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_CheckArrayList {
    public static void main(String[] args) {
        // Declared arrayList
        ArrayList<String> studentNameList = new ArrayList<>();

        // Checked the array list
        checkArrayListEmpty(studentNameList);

        // Add an element to the ArrayList
        studentNameList.add("John");
        studentNameList.add("Smith");
        studentNameList.add("Stela");

        // Checked the array list
        checkArrayListEmpty(studentNameList);

    }

    public static void checkArrayListEmpty(ArrayList studentNameList){
        if(studentNameList.isEmpty()){
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
            // Print out the collection using foreach loop
            System.out.println("Student Name's ArrayList:");
            for (Object studentName : studentNameList) {
                System.out.print(studentName + ", ");
            }
        }
    }
}
