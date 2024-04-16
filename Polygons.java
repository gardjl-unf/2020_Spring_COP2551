
public class Polygons {
/* Module 2 Ungraded Practice Exercise
Given the following table which identifies polygon types based on the number of sides, write a Java program named "PolygonManager" which prompts the user for a number of sides and displays the associated polygon type.

Your program must use a switch statement to identify the polygons having greater than 2 sides.
Your switch statement must provide a default case
All values greater than 10 should result in the "Sorry" message shown in the expected output (HINT: this is what the default case is used for).
Each case of your switch statement (including the default case) must include a break statement.
Use an "if/else" statement to eliminate the case of less than 3 sides; enclose your switch statement in the else clause.
Output should be formatted as shown in the "Expected Output" section below (you may include more test cases if you wish).
Use named constants for all "case" values (e.g. the number of sides) and for shape names. For instance, the number of sides in a triangle (3) can be represented by

        final int SIDES_TRIANGLE = 3

and the name of the polygon for the triangle case can be represented by

        final String POLY_TRIANGLE = "triangle.";    // period appended for output
Your program must conform to the programming assignment rubric provided in the Syllabus, including use of consistent indentation and alignment, an identification header at the top of your file, descriptive comments, and expected output. Do not use loops in your solution.

Sides

Description

0, 1, 2

N/A (error)

3

Triangle

4

Quadrilateral

5

Pentagon

6

Hexagon

7

Heptagon

8

Octagon

9

Nonagon

10

Decagon

 

Expected Output (user input shown in red). Make sure your program produces this output given the example user input:

Please enter the number of sides for your polygon: 0
A polygon cannot have 0 side(s)!

Please enter the number of sides for your polygon: 1
A polygon cannot have 1 side(s)!

Please enter the number of sides for your polygon: 2
A polygon cannot have 2 side(s)!

Please enter the number of sides for your polygon: 3
Your polygon is a triangle.

Please enter the number of sides for your polygon: 10
Your polygon is a decagon.

Please enter the number of sides for your polygon: 11
Sorry, I can't identify your polygon.*/
}
