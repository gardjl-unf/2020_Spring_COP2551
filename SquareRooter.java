/* COP2551C Monday April 13, 2020
 * Author: Jason Gardner
 * Filename: SquareRooter.java
 * Purpose: Module 10 Program (Test Exception Handling)
 */

public class SquareRooter {
    
    public static double sqrRoot (double val) {
        // Text of Thrown Error if val is Negative (Provided)
        final String NEGATIVE_ERROR="cannot calculate square root of negatives";
        
        // If val is Negative, Throw SquareRootArgumentException with NEGATIVE_ERROR
        if (val < 0) {
            throw new SquareRootArgumentException(NEGATIVE_ERROR);
        }
        // Otherwise, Return Square Root of any (val >= 0)
        return Math.sqrt(val);
    }
    
    public static void main (String args[]) {
        // Formatted Text Strings (Provided)
        final String FORMAT_TEST="calling sqrRoot with %1.0f\n";
        final String FORMAT_RETURN="sqr root of %1.0f is %1.1f\n";
        
        // Two Numbers for Testing (Provided)
        final double FIRST_TEST = 4.0;
        final double SECOND_TEST = -1.0;
        
        // Perform First Test
        // Output FORMAT_TEST (Provided)
        System.out.printf(FORMAT_TEST,FIRST_TEST);
        // Attempt to Provided Requested Output with FORMAT_RETURN (Provided)
        // sqrRoot is called as part of the formatted String
        try {
            System.out.printf(FORMAT_RETURN,FIRST_TEST,sqrRoot(FIRST_TEST));
        }
        // If an error is thrown during try, catch it and throw the error.
        catch (SquareRootArgumentException e) {
            throw e;
        }
        
        // Perform Second Test
        System.out.printf(FORMAT_TEST,SECOND_TEST);
        try {
            System.out.printf(FORMAT_RETURN,SECOND_TEST,sqrRoot(SECOND_TEST));
        }
        catch (SquareRootArgumentException e) {
            throw e;
        }
    }
}

class SquareRootArgumentException extends IllegalArgumentException {
    // Constructors (No-arg and Overloaded)
    public SquareRootArgumentException() {
        
    }
    public SquareRootArgumentException(String msg) {
        /* Finally, send this SquareRootArgumentException's error to
         * IllegalArgumentException.toString(msg) via super(msg) for display
         * to user.
         */
        super(msg);
    }

}

/* Expected Output (Provided):
 * 
 * calling sqrRoot with 4
 * sqr root of 4 is 2.0
 * calling sqrRoot with -1
 * SquareRootArgumentException: cannot calculate square root of negatives
 * at SquareRooter.sqrRoot(SquareRooter.java:25)
 * at SquareRooter.main(SquareRooter.java:13)
*/