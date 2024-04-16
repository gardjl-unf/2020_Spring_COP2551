/* COP2551C Monday April 6, 2020
 * Author: Jason Gardner
 * Filename: Rectangle.java
 * Purpose: Module 9 Program (Implement a Rectangle Class that Extends GeometricObject)
 */
public class Rectangle extends GeometricObject {
    
    // Private member variables
    private double width;
    private double height;
    
    // Default Constructor
    // Call super for all constructors!
    Rectangle () {
        super();
    }
    
    // Overloaded Constructor
    Rectangle (double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    
    // Overloaded Constructor with Super Parameters
    Rectangle (double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    // Getters for width/height
    public double getWidth () {
        return this.width;
    }
    
    public double getHeight () {
        return this.height;
    }
    
    // Setters for width/height
    public void setWidth (double width) {
        this.width = width;
    }
    
    public void setHeight (double height) {
        this.height = height;
    }
    
    // Methods to calculate and return area/perimeter
    public double getArea () {
        return this.width * this.height;
    }
    
    public double getPerimeter () {
        return 2 * (this.width + this.height);
    }
    
    // Format of this toString() method was included as part of the assignment.
    public String toString()
    {
        return "Rectangle with width " + this.width +
               " height " + this.height +
               " " + super.toString();
    }
}
