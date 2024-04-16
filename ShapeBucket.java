/* COP2551C
 * Modified Date: Monday April 6, 2020
 * Modifying Author: Jason Gardner
 * Filename: ShapeBucket.java
 * Original Author: No Data
 * Original Date: Monday July 18, 2016
 * Purpose: Module 9 Program
 * (ShapeBucket includes main method for testing of GeometricObject.java, Circle.java, and Rectangle.java)
 */

import java.util.ArrayList;

public class ShapeBucket {
    public static void main(String[] args) {
        
        // 1. create an ArrayList named shapeList that stores GeometricObject objects
        
        ArrayList<GeometricObject> shapeList = new ArrayList<>();
        
        /* 2. add 2 Circle objects to the shapeList container.
         * The first circle should have radius 2, color green, and filled = false
         * The second circle should have radius 3, color blue, and filled = true
         */

        shapeList.add(new Circle(2.0, "green", false));
        shapeList.add(new Circle(3.0, "blue", true));
        
        /* Added 2 Rectangle Objects to shapeList container for assignment
         * 4.0 width, 5.0 height, color black, and filled = false
         * 6.0 width, 7.0 height, color white, and filled = true
         */

        shapeList.add(new Rectangle(4.0, 5.0, "black", false));
        shapeList.add(new Rectangle(6.0, 7.0, "white", true));
        
        /* 3. use a foreach loop to iterate through each object in the shapeList container
         * and print the properties of the geometric object plus the area of the circle or
         * (hint: use the instanceof operator to verify the object is a circle/rectangle).
         */

        // Print GeometricObjects in shapeList
        for (GeometricObject g : shapeList) {
            if (g instanceof Circle) {
                System.out.println(g + "Area of circle is " + ((Circle)g).getArea());
            }
            // This format was provided as part of the assignment
            else if (g instanceof Rectangle) {
                System.out.println(g + "Perimeter of rectangle is " + ((Rectangle)g).getPerimeter());
            }
        }
    }
    
    /* Expected Output (Provided)
     * 
     * Circle with radius 2.0 created Mon Jul 18 07:44:49 EDT 2016, color green, not filled
     * Area of circle is 12.566370614359172
     * Circle with radius 3.0 created Mon Jul 18 07:44:49 EDT 2016, color blue, filled
     * Area of circle is 28.274333882308138
     * Rectangle with width 4.0 height 5.0 created Mon Jul 18 07:44:49 EDT 2016, color black, not filled
     * Perimeter of rectangle is 18.0
     * Rectangle with width 6.0 height 7.0 created Mon Jul 18 07:44:49 EDT 2016, color white, filled
     * Perimeter of rectangle is 26.0
     * 
     */
    
}