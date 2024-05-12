package java_homework_week5;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElements {

    public static void main(String[] args) {

        ArrayList<String> shapeList = new ArrayList<>();

        shapeList.add("Circle");
        shapeList.add("Oval");
        shapeList.add("Rectangle");
        shapeList.add("Square");
        shapeList.add("Triangle");
        shapeList.add("Pentagon");
        shapeList.add("Hexagon");
        shapeList.add("Heptagon");
        shapeList.add("Octagon");

        int index = 4;
        retrieveElements(index, shapeList);

    }

    public static void retrieveElements(int key, ArrayList<String> shape){
        if (key >= 0 && key < shape.size()) {
            String element = shape.get(key);
            System.out.println("Element at index " + key + ": " + element);
        } else
            System.out.println("Array Index out of bounds.");

    }
}
