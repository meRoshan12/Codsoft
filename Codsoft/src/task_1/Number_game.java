package task_1;

	import java.util.Random;
	import java.util.Scanner;
	
	/*
	 Task 1
	 Number Game
	 */
	
public class Number_game {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Random random   = new Random();
		
		
		
		//Initializing the variables
		int lowerBound = 1;
		int upperBound = 100;
		int maxAttempts = 5;
		int score = 0;
		
		
		System.out.println("Welcom to the Number Guessing Game!!");
		System.out.println("Guess the number between "+ lowerBound + " and " +upperBound);
		
		
		boolean playAgain = true;
		while (playAgain){
			int generatedNumber = random.nextInt(upperBound + lowerBound - 1) + lowerBound;
			int attempts= 0;
			boolean guessedCorrectly= false;
			
			
			while (attempts < maxAttempts && !guessedCorrectly) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == generatedNumber) {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                    score++;
	                    guessedCorrectly = true;
	                } else if (userGuess < generatedNumber) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }
			
			if (!guessedCorrectly) {
                System.out.println("Sorry! You've run out of attempts. The correct number was: " + generatedNumber);
            }
				
		
		
			System.out.print("Do you want to play again? (yes/no): ");
			String playAgainInput = scanner.next().toLowerCase();
			playAgain = playAgainInput.equals("yes");
     
		}
     System.out.println("Game Over. Your final score is: " + score);
     scanner.close();
      
	}

}

	
	


