package program6;
// Project:		Bank Account (Program 6) 
// Author:		Obinna Ezekwesili 
// Description:	Checking Account
// Date:		Oct 29, 2019
// Version:		1.0

import java.util.Scanner;
public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		    //Import Scanner for keyboard 
			Scanner keyboard = new Scanner(System.in);
			int menuChoice;
		
			
			
			
			Account accOne = new Account();
			
			do
			{
			displayMenu();
			menuChoice = keyboard.nextInt();
			
			//Input Menu Options 
			switch(menuChoice)
			{
			case 1:
				System.out.println("How much would you like to deposit?");
				accOne.depositAmount = keyboard.nextDouble();
				accOne.balance = Account.deposit(accOne.balance, accOne.depositAmount);
				accOne.displayBalance(accOne.balance);
				break;
			case 2:
				System.out.println("How much would you like to withdraw?");
				accOne.withdrawalAmount = keyboard.nextDouble();
				accOne.balance = Account.withdrawal(accOne.balance, accOne.withdrawalAmount);
				accOne.displayBalance(accOne.balance);
				break;
			case 3:
				accOne.displayBalance(accOne.balance);
				break;
			case 4:
				accOne.displayBalance(accOne.balance);
				System.out.println("Thank you! have a great day! :)");
				break;
			default:
				System.out.println("That is an invalid choice. Please re-enter an option.");
			}
			
			
			
			}while(menuChoice !=4);
			
			
			
		}

		
		
		
			
			
		

        //Menu Choice for User 
		public static void displayMenu()
		{
			System.out.println("Main Menu");
			System.out.println("=========");
			System.out.println("1.) Make Deposit");
			System.out.println("2.) Withdrawal Funds");
			System.out.println("3.) View Balance");
			System.out.println("4.) Exit");
			System.out.println("What would you like to do? ");
			
		}

	}

			