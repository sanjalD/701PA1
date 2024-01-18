
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// inheritance ==> Triangle class is inheriting Shape class
public class Triangle extends Shape
{
    // instance variables
    private int base;
    private int height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Triangle(String color, int base, int height)
    {
        // initialise instance variables
        super(color);
        this.base = base;
        this.height = height;
    }
    
    // Overriding getArea() method from Shape class    
    @Override
    public double getArea()
    {
        // put your code here
        return (this.base*this.height)/2;
    }
    
    // Overriding toString() method
    @Override
    public String toString(){
        return "=== TRIANGLE === \nBASE = "+this.base+"\nHEIGHT = "+this.height+"\n"+super.toString();
    }
}
