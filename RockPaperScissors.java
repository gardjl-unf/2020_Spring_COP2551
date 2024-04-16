/* Filename: RockPaperScissors.java
 * Original Author: D. Singletary
 * Modifying Author: Jason Gardner
 * Original Date:  2/6/17
 * Modified Date: February 10, 2020
 * Purpose: Module 5, Rock, Paper, Scissors vs. Computer Opponent
 */
 
import java.util.Scanner;
import java.util.Random;

// ********** DO NOT MODIFY BELOW **********
public class RockPaperScissors
{
      // static class constants
      static final int RAND_LIMIT = 3;
      static final int NUM_ERROR = 0;
      static final int NUM_ROCK = 1;
      static final int NUM_PAPER = 2;
      static final int NUM_SCISSORS = 3;
       
      static final String STR_ERROR = "error";
      static final String STR_ROCK = "rock";
      static final String STR_PAPER = "paper";
      static final String STR_SCISSORS = "scissors";
       
      static final int PLAYER_TIE = 0;
      static final int PLAYER_1 = 1;
      static final int PLAYER_2 = 2;
    
      public static void main(String[] args)
      {
          String inputStr; // general purpose string for input
          boolean continuing = false;
          int player1Choice = 0, player2Choice = 0;
          int winner = 0;
          
          Scanner input = new Scanner(System.in);
       
          // main loop - ask the user if they want to play
          // and continue if confirmed
          do
          {
              System.out.print("Rock, Paper Scissors: play? (y or n): ");
              inputStr = input.nextLine();
              if (!inputStr.equals("y"))
                  continuing = false;
              else
              {
                  continuing = true;

                  System.out.println("OK, let's play!");
       
                  // player 1 by default is the computer, we may want
                  // want to enhance in the future to allow two humans
                  // (or two computers!)
                  player1Choice = getComputerChoice();
                  //System.out.println("Player 1 chooses " + player1Choice); // debug
                  player2Choice = getChoice(input);
                  //System.out.println("Player 2 chooses " + player2Choice); // debug
      
                  // echo choice and determine winner
                  System.out.println("Computer chose " +
                           choiceNumToString(player1Choice) +
                           ", you chose " + choiceNumToString(player2Choice));
                  winner = determineWinner(player1Choice, player2Choice);
                  // show winner
                  if (winner == PLAYER_1)
                      System.out.println("Computer wins!");
                  else if (winner == PLAYER_2)
                      System.out.println("You win!");
                  else
                      System.out.println("Tie game!");
              }
          } while(continuing == true);
       
          System.out.println("Bye!");
      }
       
      // get, validate, and return the human user's choice
      public static int getChoice(Scanner input)
      {
          int choice = NUM_ERROR;
          boolean valid = false;
          while (!valid)
          {
              System.out.print("Please enter your choice:\n" +
                      "\t1 for ROCK\n" +
                      "\t2 for PAPER\n" +
                      "\t3 for SCISSORS" + ": ");
              choice = input.nextInt();
              input.nextLine(); // clear the buffer
              valid = isValid(choice);
              if (!valid)
                  System.out.println("Invalid choice; please enter either 1, 2, or 3");
          }
          return choice;
      }
// ********** SAFE TO MOFIFY BELOW **********
      
      public static int getComputerChoice () {
          // Generate a Random Number (1, 2, or 3)
          int computerChoice;
          Random rng = new Random();
          computerChoice = rng.nextInt(RAND_LIMIT)+1;
          return computerChoice;
      }
      
      public static String choiceNumToString (int choice) {
          // Return a String Based on Number
          String returnedString;
          switch (choice) {
              case(NUM_ROCK):
                  returnedString=STR_ROCK;
                  break;
              case(NUM_PAPER):
                  returnedString=STR_PAPER;
                  break;
              case(NUM_SCISSORS):
                  returnedString=STR_SCISSORS;
                  break;
              default:
                  returnedString=STR_ERROR;
          }
          return returnedString;              
      }
      
      public static int determineWinner (int computer, int player) {
          // Evaluate Winner by Rules of Rock, Paper, Scissors
          int winner = 0;
          if (computer == NUM_ROCK) {
              if (player == NUM_PAPER) {
                  winner = PLAYER_2;
              }
              else if (player == NUM_SCISSORS) {
                  winner = PLAYER_1;
              }
              else {
                  winner = PLAYER_TIE;
              }
          }
          else if (computer == NUM_PAPER) {
              if (player == NUM_SCISSORS) {
                  winner = PLAYER_2;
              }
              else if (player == NUM_ROCK) {
                  winner = PLAYER_1;
              }
              else {
                  winner = PLAYER_TIE;
              }
          }
          else if (computer == NUM_SCISSORS) {
              if (player == NUM_ROCK) {
                  winner = PLAYER_2;
              }
              else if (player == NUM_PAPER) {
                  winner = PLAYER_1;
              }
              else {
                  winner = PLAYER_TIE;
              }
          }
          return winner;
      }
      
      public static boolean isValid (int choice) {
          // Check for Valid Input (1, 2, 3)
          boolean valid;
          if (choice == NUM_ROCK || choice == NUM_PAPER || choice == NUM_SCISSORS) {
              valid = true;
          }
          else {
              valid = false;
          }
          return valid;
      }
}