/*ur program should:

Should meet all the requirements of the previous Rock Paper Scissors assignment.
This implementation should make of use to the try catch mechanism to capture and handle incorrect user input.
Guidelines:

The method that accepts input from the user should throw an exception if the user enters invalid input.
The calling method should use a try/catch block to handle the bad input and print a nice message to the user.
*/
import java.util.Random;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {

		System.out.println("Rock Paper Scissors, make your pick");
		
		String yourHand = yourHand();
		String computerHand = generateHand();
		
		System.out.println("You: " + yourHand);
		System.out.println("Opponent: " + computerHand);
		
		String winningMove = winningMoves(yourHand, computerHand);

		if (yourHand.toLowerCase().equals(winningMove)) {
			System.out.println("You won!");
		} else if (winningMove.contentEquals(computerHand.toLowerCase())) {
			System.out.println("Womp, womp. The computer won.");
		} else if (winningMove == "Tie"){
			System.out.println("It was a tie. Play again!");
		}

		
	}
	
	public static void checkUserInput (String s) {
		if(!(s.toLowerCase().equals("rock") || s.toLowerCase().equals("paper") || s.toLowerCase().equals("scissors"))) {
			throw new IllegalArgumentException();
		}
	}
	
	public static String yourHand() {
		Scanner reader = new Scanner(System.in);
		String yourPick = "";
		
		boolean validPick = true;
		while(validPick) {
			try {
				yourPick = reader.nextLine();
				checkUserInput(yourPick);
				validPick = false;
				
			} catch (Exception e) {
				System.out.println("Program is throwing an exception: " + e);
				System.out.println("Please enter a valid move: Rock, Paper, or Scissors.");
			} 
		}
		
		reader.close();
		return yourPick;
	}
	
	public static String generateHand() {
		Random randNumGen = new Random();
		int compNum = randNumGen.nextInt(3);
		String compHand;
		
		if (compNum == 0) {
			compHand = "Rock";
		} else if (compNum == 1) {
			compHand = "Paper";
		} else {
			compHand = "Scissors";
		}
		
		return compHand;
	}
	
	public static String winningMoves(String pickOne, String pickTwo) {
		if (pickOne.toLowerCase().equals(pickTwo.toLowerCase())) {
			return "Tie";
		}
		else if ((pickOne.toLowerCase().equals("rock") || pickTwo.toLowerCase().equals("rock")) && (pickOne.toLowerCase().equals("scissors") || pickTwo.toLowerCase().equals("scissors"))) {
			return "rock";
		}
		else if ((pickOne.toLowerCase().equals("rock") || pickTwo.toLowerCase().equals("rock")) && (pickOne.toLowerCase().equals("paper") || pickTwo.toLowerCase().equals("paper"))) {
			return "paper";
		}
		else if ((pickOne.toLowerCase().equals("paper") || pickTwo.toLowerCase().equals("paper")) && (pickOne.toLowerCase().equals("scissors") || pickTwo.toLowerCase().equals("scissors"))) {
			return "scissors";
		} else {
			return "Invalid";
		}
	
	}
}
