/* COP2551C Monday January 7, 2020
 * Author: Jason Gardner
 * Filename: KitchenConverter.java
 * Purpose: Module 1 Assignment (Convert Cups -> Tablespoons)
 */

import java.util.Scanner; //Import Scanner Object for Input

public class KitchenConverter {
    public static void main (String[] args) {

        // Variable Declaration & Initialization
        final double CONVERSION_FACTOR = 16.0;
        final String PROMPT = "Please enter the number of cups:  ";
        double cups = 0, tbsp = 0;
		
        // Create Scanner Object
        Scanner input = new Scanner (System.in);
		
        // User Prompt and Input
        System.out.print(PROMPT);
        cups = input.nextDouble();
		
        // Calculation & Output
        tbsp = cups*CONVERSION_FACTOR;
		
        //Formatted Output Line (Read something like, (format floating point variable to two decimal places))
        System.out.println("This program converts cups to tablespoons");
        System.out.printf("%.2f cups is %.2f tablespoons\n", cups, tbsp);
    }
}

/* I am working with two other students in this class that took COP1000
 * with me (Professor Barber) in C++.  Please let me know if there are 
 * concerns about similarity between our work.  Programming comes fairly
 * naturally to me and they do tend to follow my lead.  I convinced them 
 * to use a variable for the prompt, where I am sure they would not have
 * otherwise.  We met to work on this together and it was too short to
 * vary a large amount.  Thank you!
 */