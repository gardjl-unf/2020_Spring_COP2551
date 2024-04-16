/* COP2551C Monday February 24, 2020
 * Author: Jason Gardner
 * Filename: Combine.java
 * Purpose: Module 6 Program (Acquire Two Input Arrays and Combine Them, for Science!)
 */

import java.util.Scanner;

public class Combine {
    public static void main (String args[]) {
        
        // String Constants (Prompts and Output)
        final String FIRST_INPUT_PROMPT = "Please enter %d integers separated by spaces: ";
        final String SECOND_INPUT_PROMPT = "Please enter %d more integers separated by spaces: ";
        final String FIRST_OUTPUT = "array1 =";
        final String SECOND_OUTPUT = "\narray2 =";
        final String COMBINED_OUTPUT = "\ncombined =";
        
        // Integer Constants (Array Sizing)
        final int ARRAY_SIZE = 4;
        final int COMBINED_ARRAY_SIZE = 8;
        
        // Variable Declaration
        int[] array1 = new int[ARRAY_SIZE];
        int[] array2 = new int[ARRAY_SIZE];
        int[] combined = new int[COMBINED_ARRAY_SIZE];
        
        // Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        
        /* Request User Input for First and Second Arrays
         * Scanner iterates across input integers and
         * sets array values.
         */
        System.out.printf(FIRST_INPUT_PROMPT, ARRAY_SIZE);
        
        /* Novel Solution - NOTE TO SELF
         * Scanner Methods DIRECTLY interact with
         * Input.  DO NOT PUT THEM INTO A TEMPORARY VARIABLE
         * The Scanner is keeping track of which integer it
         * is on.  This is a nested loop structure for all
         * intents and purposes.
         */
        
        /* User input is expected to be 4 integers
         * separated by spaces.  Populate Array!
         */
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array1[i] = input.nextInt();
        }
        
        // Second Array (Second Verse, Same as the First)
        System.out.printf(SECOND_INPUT_PROMPT, ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array2[i] = input.nextInt();
        }
        
        combined = combineArrays(array1, array2);
        
        /* Requested Output - Arrays, so Iterate Across
         * "ForEach" in specifications
         */
        System.out.printf(FIRST_OUTPUT);
        for (int i: array1) {
            System.out.printf(" %d", i);
        }
        System.out.printf(SECOND_OUTPUT);
        for (int i: array2) {
            System.out.printf(" %d", i);
        }
        System.out.printf(COMBINED_OUTPUT);
        for (int i: combined) {
            System.out.printf(" %d", i);
        }
    }

    public static int[] combineArrays (int[] array1, int[] array2) {
        // Can't remember if we talked about scoping these class-wide
        final int ARRAY_SIZE = 4;
        final int COMBINED_ARRAY_SIZE = 8;
        
        // Combined array for Return
        int[] combined = new int[COMBINED_ARRAY_SIZE];
        
        /* Iterate across combined array, combining array1,
         * then array2 into it.
         * 
         * NOTE:  .length is a property of an array, not the same
         *      as .length() as a method for strings.  Have array
         *      sizes as constants, but wanted to use it here.
         */
        for (int i = 0; i < array1.length; i++)  {
            combined[i] = array1[i];
        }
        for (int i = ARRAY_SIZE; i < combined.length; i++)  {
            combined[i] = array2[i-ARRAY_SIZE];
        }
        return combined;
    }
}