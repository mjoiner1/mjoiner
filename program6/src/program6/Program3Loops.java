//Michael Joiner 
//Loops
package program6;

//import scanner for keyboard
import java.util.Scanner;

public class Program3Loops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare Variables
		int age;
		
		//Prompt user for their age 
				Scanner keyboard = new Scanner (System.in); 
				System.out.print("What is your age? ");
				age = keyboard.nextInt(); 
				
				for(int i = age; i<=65; i++)
				{
					if (i<65)
						System.out.println("You are " + i + " years old. Only " + (65-i) + " years until you retire.");
				else
				i--;
					System.out.println("You are 65! You can retire!");
				}	
			}

		 }

