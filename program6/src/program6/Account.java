package program6;

public class Account {
	
	public double balance;
	public double withdrawalAmount;
	public double depositAmount;
	
	//Setting Initial Balance to 0 
	public Account()
	{
		balance = 0.00;
		withdrawalAmount  = 0.00;
		depositAmount = 0.00;
		
	}
	
	//Balance Calculator 
	
	public static double deposit(double bal, double dep)
	{
		return  (bal+dep);
	}
	
	public static double withdrawal(double bal, double wit)
	{
		if(wit==bal)
		{
			return(bal-wit);
		}
		if(wit<bal)
		{
			return (bal-wit);
		}
		
		else
		{
			System.out.println("Error, insufficient funds. Please withdraw a valid amount");
			return(bal);
		}
	}
	
	public void displayBalance(double bal)
	{
		System.out.println("Your balance is: $" + balance);
	}

}