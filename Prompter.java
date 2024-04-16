import java.util.Scanner;

public class Prompter {

    public static void main(String[] args) {
        final int MININT = 1;
        final int MAXINT = 100;
       
        final double MINDOUBLE = 5.0;
        final double MAXDOUBLE = 50.0;
       
        Scanner in = new Scanner(System.in);
       
        // prompt for an int and double and display
        System.out.printf("int result: %d\n", prompt(in, MININT, MAXINT));
        System.out.printf("float result: %.2f\n", prompt(in, MINDOUBLE, MAXDOUBLE));
    }

    public static int prompt(Scanner in, final int min, final int max) {
        int input = 0;
        boolean validFlag = false;
        do {
            System.out.printf("Please enter an integer between 1 and 100: ");
            input = in.nextInt();
            if (input < max || input > min) {
                validFlag = true;
            }
            else {
                System.out.printf("Invalid value, please try again.\n");
            }
        } while (!validFlag);
        return input;
    }

    public static double prompt(Scanner in, final double min, final double max) {
        double input= 0;
        boolean validFlag = false;
        do {
            System.out.printf("Please enter an floating point value between 5.0 and 50.0: ");
            input = in.nextDouble();
            if (input < max || input > min) {
                validFlag = true;
            }
            else {
                System.out.printf("Invalid value, please try again.\n");
            }
        } while (!validFlag);
        return input;
    }
}
        