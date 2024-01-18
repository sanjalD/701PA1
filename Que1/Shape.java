
/**
 * Write a description of class Shape here.
 *
 * @author (25 Charmi Modi)
 */
// Super Class
public class Shape
{
    // instance variables
    private String color = "";

    /**
     * Constructor for objects of class Shape
     */
    public Shape(String color)
    {
        // initialise instance variables
        this.color = color;
    }

    public double getArea()
    {
        // put your code here
        System.out.println("Create instance of any shape first..!");
        return 0;
    }
    // Overriding toString() method   
    @Override
    public String toString() {
        return "Color = "+ this.color;
    }
}
