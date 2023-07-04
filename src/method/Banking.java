package method;

public class Banking {
	
	static int currentBalance = 1000;
	
	public static void greetCustomer() 
	{
		System.out.println("welcome");
	}
//	static method
	public void deposite(int amount )
	{
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited successfully");
	}
//	non static method
	public static void withdrawal(int amount) 
	{
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdrawn successfully");
		
	}
// static method	
	public int getCurrentBalance() {
		return currentBalance;   
   //current balance is numeric thats why we should use return type is int.		
		
	}
	
	
	public static void main(String[] args) {
		Banking banking = new Banking(); //object
		greetCustomer(); //method call using static method
		System.out.println("Current Balance :" + banking.getCurrentBalance());
		banking.deposite(1000); //method call using non static method which means we should use object.
		System.out.println("Current Balance :" + banking.getCurrentBalance());
		withdrawal(500);
		System.out.println("Current Balance :" + banking.getCurrentBalance());
	}
//	main method

}
