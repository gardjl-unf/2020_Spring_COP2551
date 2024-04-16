/* COP2551C Monday January 13, 2020
 * Author: Jason Gardner
 * Filename: VegetablePricer.java
 * Purpose: Module 2 Program (Provide Pricing Data from Input Using Switch)
 */

import java.util.Scanner;

public class VegetablePricer {
    public static void main (String[] args){
        // Declare and Initialize Variables
        final String PROMPT = "Please enter a vegetable name. Choices are:";
        final String VEGETABLE_ONE = "artichoke", VEGETABLE_TWO = "broccoli", VEGETABLE_THREE = "carrot", VEGETABLE_FOUR = "okra", VEGETABLE_FIVE = "tomato";
        final double PRICE_ONE = 2.21, PRICE_TWO = 2.57, PRICE_THREE = 0.74, PRICE_FOUR = 3.21, PRICE_FIVE = 3.69;
        String input;

        // Instantiate Scanner
        Scanner inputScanner = new Scanner (System.in);

        // Input Prompt
        System.out.println(PROMPT);
        System.out.printf("\t%s\n\t%s\n\t%s\n\t%s\n\t%s\nYour choice => ", VEGETABLE_ONE, VEGETABLE_TWO, VEGETABLE_THREE, VEGETABLE_FOUR, VEGETABLE_FIVE);
        input = inputScanner.nextLine();

        // Evaluate Input & Output If A Match is Found, Default: Notify User of Invalid Entry
        switch (input.toLowerCase()) {
            case VEGETABLE_ONE:
                System.out.printf("%s: Price per lb. is $%.2f\n", VEGETABLE_ONE, PRICE_ONE);
                break;
            case VEGETABLE_TWO:
                System.out.printf("%s: Price per lb. is $%.2f\n", VEGETABLE_TWO, PRICE_TWO);
                break;
            case VEGETABLE_THREE:
                System.out.printf("%s: Price per lb. is $%.2f\n", VEGETABLE_THREE, PRICE_THREE);
                break;
            case VEGETABLE_FOUR:
                System.out.printf("%s: Price per lb. is $%.2f\n", VEGETABLE_FOUR, PRICE_FOUR);
                break;
            case VEGETABLE_FIVE:
                System.out.printf("%s: Price per lb. is $%.2f\n", VEGETABLE_FIVE, PRICE_FIVE);
                break;
            default:
                System.out.printf("%s: Sorry, that vegetable is not recognized.\n", input);
        }
        
    }
}