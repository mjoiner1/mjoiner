// Michael Joiner
package program6;
//Import Scanner
//Import Randomizer
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class program7 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                // Create Variables
                
        	Scanner keyboard = new Scanner(System.in);
                int[] numbers= new int [10];
                Random rnd = new Random ();

                numbers [0] = 14;
                numbers [1] = 8;
                numbers [2] = 31;
                numbers [3] = 5;
                numbers [4] = 2;
                numbers [5] = 10;
                numbers [6] = 41;
                numbers [7] = 35;
                numbers [8] = 30;
                numbers [9] = 12;

                for(int i = 0;i<numbers.length; i++)
                {
                        System.out.println(" The index of " + i + " is " + numbers[i]);
                        System.out.println("");

                }

                System.out.println(" Hello, Welcome to Slamball 2.0!");

        		
                int [][] values = {{0,0,0,0},{0,0,0,0}};
        		//the array will look like this 
        		// 0 0 0 0
        		// 0 0 0 0
        		
                //Using this to add space between lines 
        		System.out.println(""); 
        		
        		//Display the 8 
        		System.out.println("          Scoreboard "); 
        		
        		// assign a total variable 
        		double total = 0.00; 
        		
        		// Loop through each row 
        		for(int row = 0; row < values.length;row++)   
        		{
        			total = 0; 
        			
        			// Loop through each column
        			for (int col = 0; col<values[0]. length; col++)
        			{
        		         System.out.print(values[row][col] + "\t"); 
        		         total = total + values [row][col]; 
        			}
        			
        			System.out.print(total + "\n");
        		}
   
        		// Game Introduction 
                System.out.println("");
                System.out.println(" Description:In this game you will use trampolines and your teamates to score baskets for your team.");
                System.out.println(" In this game you will have 4 teamates to help you beat the team");
                System.out.println("");
                System.out.println(" Each round is 3 minutes long to try to outscore the team  ");
                System.out.println("");

                int arraySize = 0;
                System.out.println("Night 1? ");
                arraySize = keyboard.nextInt();
                int[] rounds = new int [arraySize];
                int totalteam1 = 0; 
                int totalteam2 = 0; 
        
                for(int i = 0; i <arraySize; i++)
                {
                        rounds [i] = rnd.nextInt(101);
                        System.out.println(" Team 1 Spikes made during round " + i + " is "+ rounds[i]);
                        totalteam1 = totalteam1 + rounds [i];

                        rounds [i] = rnd.nextInt(101);
                        System.out.println(" Team 2 Spikes made during inning " + i + " are "+ rounds[i]);
                        totalteam2 = totalteam2 + rounds [i];
                }

                System.out.println("");
                System.out.println(" Team 1 total points scored: " + totalteam1);
                System.out.println(" Team 2 total points scored: " + totalteam2);
                System.out.println("Lets see who won!");

                if (totalteam1 < totalteam2) 
                  System.out.println(" Team 2 won!!");
          else 
                if (totalteam2 < totalteam1) 
                  System.out.println(" Team 1 won!! ");
                	
               
                int team1wincount = 10 ;
                int team2wincount = 11 ;
                
                if (team2wincount > team1wincount) {
                	System.out.println("Team 2 wins the ultimate online spikeball rivalry");
                }
        }

        		// Account for if an error occurs during file usage
            	public static void main1(String[] args) throws IOException{
            		// TODO Auto-generated method stub

                 // This is where the game would get data
                 FileWriter fw = new FileWriter("/Users/obi/Desktop/gamedata.txt", true);
                 PrintWriter outputFile = new PrintWriter(fw);
                 
                 //  a file to read in from
                 File myFile = new File("/Users/obi/Desktop/gamedataout.txt");
                 Scanner inputFile = new Scanner(myFile);
                 
                 while (inputFile.hasNext())
                 {
                     // Read line from input file
                     String studentName = inputFile.nextLine();
                     studentName = studentName + " is " + studentName.length() + " characters long.";
                     System.out.println(studentName);
                     
                     // Write to file
                     outputFile.println(studentName);
                 }
                 
                 
                 // Close the files
                 outputFile.close();
                 inputFile.close();
            		

        }

        }