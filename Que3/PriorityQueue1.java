import java.io.*;
import java.util.*;

/**
 * Write a description of class PriorityQueue1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PriorityQueue1
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Queue q = new LinkedList();
    public static void main(String[] args) throws IOException{
        int choice = 0;
        do{
            System.out.println("1. Add \t  2. Remove\t3. Display\t4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    insert();
                    break;
                case 2:
                    del();
                    break;
                case 3:
                    display();
                    break;
            }
        }while(choice != 4);
    }
    static void insert() throws IOException {
        System.out.print("Enter any value: ");
        Object ele = br.readLine();
        q.add(ele);
    }
    static void del() {
        Object ele = q.remove();
        System.out.println("Deleted Element: "+ele);
    }
    static void display() {
        /* for(Object ele : q) {
            System.out.print(ele + " ");
        }
        System.out.println();*/
        Iterator i = q.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();
    }
}
