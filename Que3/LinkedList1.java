import java.util.*;
import java.io.*;

/**
 * Write a description of class LinkedList1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList1
{
    public static void Main(String[] args) throws IOException {
        //Linked List
        LinkedList<String> al = new LinkedList<String>();
        int choice = 0;
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* al.add("Charmi");
        al.add("Kevin");
        al.add("Dhruvil");
        */
        do{
            System.out.println("1. Add \t   2. Remove\t3. Display\t4. Exit");
            // choice = sc.nextInt();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    System.out.print("Enter a Value: ");
                    // al.add(sc.nextLine());
                    al.add(br.readLine());
                    break;
                case 2:
                    System.out.print("Enter the value to be removed: ");
                    // al.remove(sc.nextLine());
                    al.remove(br.readLine());
                    break;
                case 3:
                    for(String i : al){
                        System.out.println(i);
                    }
                    break;
            }
        }while(choice != 4);
    }
}
