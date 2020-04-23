// Michael Joiner 
// Program 2 Using Scanners and Integers 


package program6;
import java.util.Scanner;
public class UsingScanners
{
	public static void main (String args [])
	  {
		//Variables
		int Number1 = 0;
		int Number2 = 0;
		int Number3 = 0;
		char Operator;
		double Answer = 0;  
		//Keyboard input
		  Scanner keyboard = new Scanner
		  (System.in);
		  
		//Menu
		     System.out.print("Enter First Number: ");
		     Number1 = keyboard.nextInt();
		     System.out.print("Enter Second Number: ");
		     Number2 = keyboard.nextInt();
		     System.out.print("Enter Third Number: ");
		     Number3 = keyboard.nextInt();
		     System.out.print("Menu of Actions:\n");
		     System.out.println("\tAdd:+\n\tSubtract:-\n\tMultiply:*\n\tDivide:/");
		     System.out.print("What Operation? ");
		     Operator = keyboard.next().charAt(0);
		     
		   //Switch Statement
		       switch (Operator) {
		    	 case '+': Answer = Number1 + Number2;
		                   break;
		    	 case '-': Answer = Number1 - Number2;
		    	           break;
		    	 case '*': Answer = Number1 * Number2;
		    	           break;
		    	 case '/': Answer = Number1 / Number2;
		    	           break;
		       }
		       System.out.println(Number1+" "+Operator+" "+Number2+" "+" = "+Answer);
			     
	            if (Answer > Number3) 
	            	System.out.println(Answer+" "+"is greater than "+Number3+" ");
	            else
	            	System.out.println(Answer+" "+"is not greater than "+Number3+" ");
	//Close keyboard
	keyboard.close();
		
 
 }
}



