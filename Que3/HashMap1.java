import java.util.*;

/**
 * Write a description of class HashMap1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashMap1
{
    public static void main(String args[]) {

        HashMap<String, String> students = new HashMap<String, String>();
        // Add keys and values (Country, City)
        students.put("IT8", "Charmi Modi");
        students.put("IT6", "Kshama Patel");
        students.put("IT4", "Parthiv Modi");
        System.out.println(students);

        // Print keys
        for (String i : students.keySet()) {
            System.out.println("Semester: "+ i + " ==> Name: "+ students.get(i));
        }
    }
}
