
public class SavingsAccountTest {

	public static void main(String[] args) {
		
		//initialize accounts
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		//set static interest rate
		saver1.modifyInterestRate(4);
		
		//loop for twelve months of interest on 1
		System.out.println("Account 1 at 4% interest starting with $2000");
		for (int i = 1; i <= 12; i++) {
			
			saver1.applyInterest(saver1.calculateMonthlyInterest());
			System.out.printf("Month %d: ", i);
			saver1.printBalance();
			
		}

		System.out.println();
		
		//loop for twelve months of interest on 2
		System.out.println("Account 2 at 4% interest starting with $3000");
		for (int i = 1; i <= 12; i++) {
			
			saver2.applyInterest(saver2.calculateMonthlyInterest());
			System.out.printf("Month %d: ", i);
			saver2.printBalance();
			
		}
		
		System.out.println();
		
		//modify static interest rate
		saver1.modifyInterestRate(5);
		
		//calculate and print balance of 1 at 5%
		System.out.println("Account 1 after an additional month at 5% interest");
		saver1.applyInterest(saver1.calculateMonthlyInterest());
		System.out.printf("Month 13: ");
		saver1.printBalance();
		
		System.out.println();
		
		//calculate and print balance of 2 at 5%
		System.out.println("Account 2 after an additional month at 5% interest");
		saver2.applyInterest(saver2.calculateMonthlyInterest());
		System.out.printf("Month 13: ");
		saver2.printBalance();
		
	}

}
