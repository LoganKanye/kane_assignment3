import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {

	//objects
	private static Scanner in = new Scanner(System.in);
	private static SecureRandom generator = new SecureRandom();
		
	//variables
	private int num1;
	private int num2;
	private int answer;
	private int response;
	
	//program logic
	public void quiz() {
		
		//generate problem
		num1 = generator.nextInt(10);
		num2 = generator.nextInt(10);
		answer = num1 * num2;
		
		//read problem and record initial response
		this.askQuestion();
		this.readResponse();
		
		//loop until correct answer given
		while (this.isAnswerCorrect() == 0) {
			
			this.displayIncorrectResponse();
			this.readResponse();
			
		}
		
		//congratulate user and end program
		this.displayCorrectResponse();
		in.close();
		
	}
	
	//asks user question
	public void askQuestion() {
		
		System.out.printf("How much is %d times %d?%n", num1, num2);
		
	}
	
	//reads user response
	public void readResponse() {
		
		response = in.nextInt();
		
	}
	
	//checks if answer is correct
	public int isAnswerCorrect() {
		
		if(answer == response) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	//displays correct message
	public void displayCorrectResponse() {
		
		int rand = generator.nextInt(4) + 1; 
		
		switch(rand) {
		case 1: 
			System.out.println("Very Good!");
			break;
		case 2: 
			System.out.println("Excellent!");
			break;
		case 3: 
			System.out.println("Nice Work!");
			break;
		case 4: 
			System.out.println("Keep up the good work!");
			break;
		}
		
	}
	
	//displays incorrect message
	public void displayIncorrectResponse( ) {
		
		int rand = generator.nextInt(4) + 1;
		
		switch(rand) {
			case 1: 
				System.out.println("No. Please try again.");
				break;
			case 2: 
				System.out.println("Wrong. Try once more.");
				break;
			case 3: 
				System.out.println("Don't give up!");
				break;
			case 4: 
				System.out.println("No. Keep trying.");
				break;
		}
		
	}

	//main
	public static void main(String[] args) {
		
		//generate and run quiz
		CAI2 test = new CAI2();
		test.quiz();

	}
	
}
