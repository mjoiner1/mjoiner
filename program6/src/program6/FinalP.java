// Author: Michael Joiner 
// Project//  Final Project 
// Rock Paper Scissors App 
// May 5th,2020
package program6;


import java.util.Scanner; 
import java.util.Random; 


public class FinalP 
{ 
public static void main(String[] args) 
{ 
    String personPlay; //User's play -- "R", "P", or "S" 
    String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
    int computerInt; //Randomly generated number used to determine 
                     //computer's play 
    String response; 


    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Welcome, to Rock, Paper, Scissors!\n" + 
                       "Please enter Rock,Paper,or Scissors.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    System.out.println();

    //Generate computer's play (0,1,2) 
    computerInt = generator.nextInt(3)+1; 

    //Translate computer's randomly generated play to 
    //string using if //statements 

    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 


    //Get player's play from input-- note that this is 
    // stored as a string 
    System.out.println("Enter your play: "); 
    personPlay = scan.next();

    //Make player's play uppercase for ease of comparison 
    personPlay = personPlay.toUpperCase(); 

    //Print computer's play 
    System.out.println("Computer played : " + computerPlay); 


    //See who won. Use nested ifs 

    if (personPlay.equals(computerPlay)) 
       System.out.println("It's a tie!"); 
    else if (personPlay.equals("R")) 
       if (computerPlay.equals("S")) 
          System.out.println("Rock Beats scissors. You win!!");
    else if (computerPlay.equals("P")) 
            System.out.println("Paper consumes rock. You lose!!"); 
    else if (personPlay.equals("P")) 
       if (computerPlay.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
    else if (personPlay.equals("S")) 
         if (computerPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You win!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!"); 
    else 
         System.out.println("Invalid user input.");
  
    // Best out of three games 
   
    }
 
    
}
