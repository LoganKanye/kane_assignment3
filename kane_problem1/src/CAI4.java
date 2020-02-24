import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class CAI4 {

	//objects
	private static Scanner in = new Scanner(System.in);
	private static SecureRandom generator = new SecureRandom();
	private ArrayList<Integer> results = new ArrayList<Integer>(10);
		
	//variables
	private int num1;
	private int num2;
	private int answer;
	private int response;
	private int state = 0;
	private int difficulty;
	
	//program logic
	public void quiz() {
		
		//loop until user wishes to quit
		while (state == 0) {
			
			//determine difficulty
			this.readDifficulty();
			
			for (int i = 0; i < 10; i++) {
				
				//read problem and record response
				this.generateQuestionArgument();
				this.askQuestion();
				this.readResponse();
				
				if (this.isAnswerCorrect() == 1) {
					
					this.displayCorrectResponse();
					results.add(1);
					
				}
				else {
					
					this.displayIncorrectResponse();
					results.add(0);
					
				}
				
				
			}
			
			//display result message
			this.displayCompletionMessage();
			
			//continue or exit program
			int changeState;
			System.out.println("Do you wish to solve another problem set? (Type 1 to continue, 2 to exit program)");
			changeState = in.nextInt();
			if (changeState == 2) {
				
				state = 1;
				
			}
			System.out.println();
			
			//clear results array
			results.clear();
			
		}
		
		//close scanner
		in.close();
		
	}
	
	public void readDifficulty() {
		
		System.out.println("What difficulty would you like? (1-4)");
		difficulty = in.nextInt();
		System.out.println();
		
	}
	
	//calculates average
	public double calculateAverage() {
		
		double sum = 0;
		
		for (int i = 0; i < 10; i++) {
			
			sum += results.get(i);
			
		}
		
		return (sum / 10) * 100;
		
	}
	
	//display appropriate message based on average
	public void displayCompletionMessage() {
		
		System.out.printf("You scored %.0f percent.%n", this.calculateAverage());
		
		if (this.calculateAverage() >= 75) {
			
			System.out.println("Congratulations, you are ready to go to the next level!");
			System.out.println();
			
		}
		else {
			
			System.out.println("Please ask your teacher for extra help.");
			System.out.println();
			
		}
		
	}
	
	//generate problem
	public void generateQuestionArgument() {
		
		num1 = generator.nextInt((int) Math.pow(10, difficulty));
		num2 = generator.nextInt((int) Math.pow(10, difficulty));
		answer = num1 * num2;
		
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
			System.out.println();
			break;
		case 2: 
			System.out.println("Excellent!");
			System.out.println();
			break;
		case 3: 
			System.out.println("Nice Work!");
			System.out.println();
			break;
		case 4: 
			System.out.println("Keep up the good work!");
			System.out.println();
			break;
		}
		
	}
	
	//displays incorrect message
	public void displayIncorrectResponse( ) {
		
		int rand = generator.nextInt(4) + 1;
		
		switch(rand) {
			case 1: 
				System.out.println("No. Please try again.");
				System.out.println();
				break;
			case 2: 
				System.out.println("Wrong. Try once more.");
				System.out.println();
				break;
			case 3: 
				System.out.println("Don't give up!");
				System.out.println();
				break;
			case 4: 
				System.out.println("No. Keep trying.");
				System.out.println();
				break;
		}
		
	}

	//main
	public static void main(String[] args) {
		
		//generate and run quiz
		CAI4 test = new CAI4();
		test.quiz();

	}
	
}
