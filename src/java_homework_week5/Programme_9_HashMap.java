package java_homework_week5;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {

    public static void main(String[] args) {
        //Create Hashmap to store String keys and integer value
        Map<String, Integer> student = new HashMap();
        student.put("John", 56);
        student.put("David", 30);
        student.put("Prime", 22);
        student.put("Test", 26);

        checkHashMap(student);
    }

    public static void checkHashMap(Map<String, Integer> student){
        // foreach loop is used to iterate the value in the map
        System.out.println("Roll no of the student in the map");
        for ( Map.Entry<String, Integer> studentName  : student.entrySet()){
            System.out.println(studentName.getKey() + " " + studentName.getValue());
        }
    }
}
