
/**
 * Write a description of class Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program
{
    public static void Main(String[] args) {
        
        // upcasting
        Shape rect = new Rectangle("blue", 10, 3);
        System.out.println(rect); // rect.toString()
        
        System.out.println("\nArea of Rectangle = "+rect.getArea()+"\n\n");
        
        Shape tri = new Triangle("green", 8, 5);
        System.out.println(tri); // tri.toString()
        
        System.out.println("\nArea of Triangle = "+tri.getArea()+"\n\n");
        
        // downcasting
        Rectangle shape = (Rectangle)rect;
        System.out.println(shape); // shape.toString()
        System.out.println("\nArea of Rectangle = "+shape.getArea());
    }    
}
