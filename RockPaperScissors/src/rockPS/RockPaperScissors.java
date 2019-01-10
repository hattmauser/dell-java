package rockPS;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		System.out.println("Rock Paper Scissors, make your pick");
		
		String yourHand = yourHand();
		String computerHand = generateHand();
		
		System.out.println("You: " + yourHand);
		System.out.println("Opponent: " + computerHand);
		
		String winningMove = winningMoves(yourHand, computerHand);

		if (yourHand.equals(winningMove)) {
			System.out.println("You won!");
		} else if (winningMove == computerHand) {
			System.out.println("Womp, womp. The computer won.");
		} else if (winningMove == "Tie"){
			System.out.println("It was a tie. Play again!");
		}
		
	}
	
	public static String yourHand() {
		Scanner reader = new Scanner(System.in);
		String yourPick = reader.nextLine();
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
		if (pickOne.equals(pickTwo)) {
			return "Tie";
		}
		else if ((pickOne.equals("Rock") || pickTwo.equals("Rock")) && (pickOne.equals("Scissors") || pickTwo.equals("Scissors"))) {
			return "Rock";
		}
		else if ((pickOne.equals("Rock") || pickTwo.equals("Rock")) && (pickOne.equals("Paper") || pickTwo.equals("Paper"))) {
			return "Paper";
		}
		else if ((pickOne.equals("Paper") || pickTwo.equals("Paper")) && (pickOne.equals("Scissors") || pickTwo.equals("Scissors"))) {
			return "Scissors";
		} else {
			return "Invalid";
		}
	}
	
			
}
