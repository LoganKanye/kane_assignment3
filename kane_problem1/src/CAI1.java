import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {
	
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
		
		System.out.println("Very good!");
		
	}
	
	//displays incorrect message
	public void displayIncorrectResponse( ) {
		
		System.out.println("No. Please try again.");
		
	}

	//main
	public static void main(String[] args) {
		
		//generate and run quiz
		CAI1 test = new CAI1();
		test.quiz();

	}

}
