/* COP2551C Monday February 4, 2020
 * Author: Jason Gardner
 * Filename: Bistro.java
 * Purpose: Module 4 Program (Babette's Bistro Ordering System)
 */

import java.util.Scanner;

public class Bistro {
    public static void main (String args[]) {
        // Declare and Initialize Variables
        // **** String Constants
        final String STR_F_WELCOME = "Welcome to Babette's Bistro!\n";
        final String STR_F_INSTRUCTIONS = "Please enter an item to order, or 0 to complete your order.\n";
        final String STR_F_MENU_ITEM = "Enter %d to order %s for $%.2f\n";
        final String STR_F_ITEM_ORDERED = "You have ordered a total of %d %s(s)\n";
        final String STR_INPUT_PROMPT = "Order: ";
        final String STR_F_INVALID_ENTRY = "Please enter a valid choice between 0 and 3\n";
        final String STR_F_RECEIPT_HEADER = "You have ordered";
        final String STR_F_RECEIPT_ITEM = "\t%d order(s) of %s\n";
        final String STR_F_RECEIPT_TOTAL ="Your total cost is $%.2f";        
        // **** Sentinel Value
        int menuSelection = 1;
        // **** Accumulator for Receipt Total
        double orderTotal = 0.00;
        // **** Related Data in "Linked Arrays" (Approximating an Object)
        // Item Names in the Format ADJ +
        final String MENU_ITEM_ADJ[] = { "braised", "crispy", "grilled"};
        final String MENU_ITEM_NOUN[] = { "rabbit", "duck", "steak" };
        final double MENU_PRICES[] = { 8.89, 7.99, 10.57 };
        int orderedItems[] = { 0, 0, 0 };
        final int MENU_OPTIONS = 3;
        // *** Instantiate Scanner Object
        Scanner input = new Scanner (System.in);

        // Welcome Message (Once)
        System.out.printf(STR_F_WELCOME);
        
        do {
            System.out.printf(STR_F_INSTRUCTIONS);
            // Iterate Across Linked Arrays, Display Menu Options
            for (int i = 1; i <= (MENU_OPTIONS); i++) {
                // .trim() Included for Edge Case Where Adjective Not Present (NOT IN HARD-CODED DATA)
                System.out.printf(STR_F_MENU_ITEM, i, (MENU_ITEM_ADJ[i-1] + " " + MENU_ITEM_NOUN[i-1]).trim(), MENU_PRICES[i-1]);
            }
            // Get User Input
            System.out.print(STR_INPUT_PROMPT);
            menuSelection = input.nextInt();
            
            // Evaluate User Input
            // SWITCH REQUIRED (Duplicated Code) => Comments Are An Option to Remove Duplicate Code
            //if (menuSelection != 0 && menuSelection <= MENU_OPTIONS) {
            switch (menuSelection) {
                case 0:
                    break;
                case 1:
                    orderedItems[menuSelection-1]++;
                    System.out.printf(STR_F_ITEM_ORDERED, orderedItems[menuSelection-1], MENU_ITEM_NOUN[menuSelection-1]);
                    break;
                case 2:
                    orderedItems[menuSelection-1]++;
                    System.out.printf(STR_F_ITEM_ORDERED, orderedItems[menuSelection-1], MENU_ITEM_NOUN[menuSelection-1]);
                    break;
                case 3:
                    orderedItems[menuSelection-1]++;
                    System.out.printf(STR_F_ITEM_ORDERED, orderedItems[menuSelection-1], MENU_ITEM_NOUN[menuSelection-1]);
                    break;
                default:
                    //else if (menuSelection != 0) {
                    // Notify User of Invalid Input
                    System.out.printf(STR_F_INVALID_ENTRY);
                    break;
            }
        } while (menuSelection != 0); // Sentinel Value Condition

        //input.close();
        // Generate Receipt
        System.out.printf("%s\n", STR_F_RECEIPT_HEADER);
        // Iterate Across Linked Arrays, Calculate and Display Total
        for (int i = 0; i <= (MENU_OPTIONS - 1); i++) {
            System.out.printf(STR_F_RECEIPT_ITEM, orderedItems[i], MENU_ITEM_NOUN[i]);
            orderTotal += (MENU_PRICES[i] * orderedItems[i]); 
        }
        System.out.printf(STR_F_RECEIPT_TOTAL, orderTotal);
    }
}