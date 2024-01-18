import java.util.*;

/**
 * Write a description of class ArrayList1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayList1
{
    public static void main(String[] args){
        //using <datatype> or Wrapper classes
        List<String> al = new ArrayList<String>();
        
        // add() = to insert the specified element
        al.add("Apple");
        al.add("Orange");
        al.add(1,"Mango");
        al.add("Graphs");
        
        System.out.println("al[2]: "+al.get(2));
        
        //foreach loop
        System.out.println("\nUSING FOREACH LOOP..");
        for(String s : al){
            System.out.print(s+", ");
        }
        System.out.println();
        
        /*
         * // clear() = to remove all of the elements from this list
         * al.clear();
         */
        
        // sorting an arraylist
        Collections.sort(al);
        
        //iterator
        System.out.println("\nUSING ITERATOR..");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println();
    }
}
