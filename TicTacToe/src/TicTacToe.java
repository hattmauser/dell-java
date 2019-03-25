import java.util.Scanner;

public class TicTacToe {
	
	static String player = " X";
	static String[][] board = new String[][]{
		{"  ","  ","  "},
		{"  ","  ","  "},
		{"  ","  ","  "}
	};
	
	public static void main(String[] args) {
		System.out.println("Let's play tic tac toe.");
		printBoard();
		
		System.out.println("It's player "+player+"'s turn");
		
		while(!didPlayerWin()) {
			playTurn();
		}

	}
	
	
	public static void playTurn( ) {
		System.out.println("You will enter the row and column for your position placement.");
		System.out.print("Enter Row: ");
		
		Scanner reader = new Scanner(System.in);
		int playerRow = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter Column: ");
		int playerCol = Integer.parseInt(reader.nextLine());
		
		if(board[playerRow][playerCol] != "  ") {
			System.out.println("Invalid move. Player already in position.");
			playTurn();
		} else {
			board[playerRow][playerCol] = player;
		}
		
		
		printBoard();
		
		if(didPlayerWin()) {
			System.out.println("Player " + player + " wins!");
		} else {
			player = (player == " X") ? " O" : " X";
			System.out.println("It's player "+player+"'s turn");
			playTurn();
		}
		
		reader.close();
				
	}
	
	public static void printBoard() {
		System.out.println("   0   1   2");
		System.out.println("0 " + String.join(" |",board[0]));
		System.out.println("  -----------");
		System.out.println("1 " + String.join(" |",board[1]));
		System.out.println("  -----------");
		System.out.println("2 " + String.join(" |",board[2]));
	}
	
	public static boolean didPlayerWin() {
		if ((board[0][0] == player && board[0][1] == player && board[0][2] == player) ||
			(board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
			(board[2][0] == player && board[2][1] == player && board[2][2] == player)
			) {
			return true;
		} else if ((board[0][0] == player && board[1][0] == player && board[2][0] == player) ||
				(board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
				(board[0][2] == player && board[1][2] == player && board[2][2] == player)
				) {
			return true;
		} else if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
				(board[0][2] == player && board[1][1] == player && board[2][0] == player)
				) {
			return true;
		
		}
		
		return false;
	}
	
	
}
