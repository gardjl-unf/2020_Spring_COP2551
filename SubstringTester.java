/* COP2551C Monday January 13, 2020
 * Author: Jason Gardner
 * Filename: SubstringTester.java
 * Purpose: Module 3 Program (Test If a String is a Substring of Another)
 */

import java.util.Scanner;

public class SubstringTester {
    public static void main (String[] args) {
        // Declaration & Initialization
        final String PROMPT_ONE = "Please enter a string: ";
        final String PROMPT_TWO = "Please enter another string: ";
        String inputExternal, inputInternal;
        
        // Instantiate Scanner
        Scanner input = new Scanner (System.in);
        
        // Request Inputs
        System.out.print(PROMPT_ONE);
        inputExternal = input.nextLine();
        System.out.print(PROMPT_TWO);
        inputInternal = input.nextLine();
        
        //Evaluate & Output
        if (inputExternal.indexOf(inputInternal)!=-1) {
            System.out.printf("\"%s\" is a substring of \"%s\"%n", inputInternal, inputExternal);
        }
        else {
            System.out.printf("\"%s\" is not a substring of \"%s\"%n", inputInternal, inputExternal);
        }        
    }
}
