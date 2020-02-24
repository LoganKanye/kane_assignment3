
public class SavingsAccount {

	//declare variables
	private static double annualInterestRate;
	private double savingsBalance;
	
	//constructor
	public SavingsAccount(double balance) {
		
		this.savingsBalance = balance;
		
	}
	
	//change private interest rate
	public void modifyInterestRate(double rate) {
		
		annualInterestRate = rate;
		
	}
	
	//calculates interest for one month
	public double calculateMonthlyInterest() {
		
		return this.savingsBalance * (annualInterestRate / 1200);
		
	}

	//applies interest to private balance
	public void applyInterest(double interest) {
		
		this.savingsBalance += interest;
		
	}
	
	//prints private balance 
	public void printBalance() {
		
		System.out.printf("Your savings balance is currently: $%.2f%n", this.savingsBalance);
		
	}
	
}
