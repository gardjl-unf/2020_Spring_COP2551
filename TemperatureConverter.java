/* COP2551C Monday January 7, 2020
 * Author: Jason Gardner
 * Filename: TemperatureConverter.java
 * Purpose: Module 1 Practice (Convert Fahrenheit -> Celcius)
 */

import java.util.Scanner; //Import Scanner Object for Input

public class TemperatureConverter {
    public static void main (String[] args) {
        // Variable Declaration & Initialization
        final double CONVERSION_FACTOR = 5.0/9.0;
        final int OFFSET = 32;
        final String PROMPT = "Please enter temperature as a whole number in degrees fahrenheit:  ";
        int fahrenheit = 0;
        double celsius = 0;
        
        // Create Scanner Object
        Scanner input = new Scanner (System.in);
        
        // User Prompt and Input
        System.out.print(PROMPT);
        fahrenheit = input.nextInt();
        
        // Calculation & Output
        celsius = (fahrenheit - OFFSET) * CONVERSION_FACTOR;
        
        System.out.printf("You entered %d degrees fahrenheit; " +
                "this is %.2f degrees celsius\n",
                fahrenheit, celsius);
    }
}
