import java.util.*;
import java.io.*;

/**
 * Write a description of class TreeSet1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeSet1
{
    public static void Main(String[] args) throws IOException {
        TreeSet ts = new TreeSet();
        int choice = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("1. Add \t  2. Remove\t3. Display\t4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    System.out.print("Enter a value: ");
                    ts.add(br.readLine());
                    break;
                case 2:
                    System.out.print("Enter element: ");
                    ts.remove(br.readLine());
                    break;
                case 3:
                    Iterator i = ts.iterator();
                    while(i.hasNext()){
                        System.out.println(i.next());
                    }
                    break;
            }
        }while(choice != 4);
    }
}
