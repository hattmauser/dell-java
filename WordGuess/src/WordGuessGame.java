import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {
	static String wordProgress = "";
	static String word = generateWord();

	public static void main(String[] args) {
		//prints initial word, should show as hidden
		printWordProgress();
		
		//prompt user to enter letter
		System.out.println("Choose a lower-case letter.");
		Scanner reader = new Scanner(System.in);
		String chosenLetter = "";

		
		//keep prompting until user enters valid letter
		//program will run until word is complete
		while(!wordComplete()) {
			boolean isLetter = false;
			while(!isLetter) {
				try {
					chosenLetter = reader.nextLine();
					checkUserInput(chosenLetter);
					isLetter = true;
				//catch if user doesn't enter letter
				} catch (IllegalArgumentException e) {
					System.out.println("Please enter a letter.");
				//catch if user enters same letter
				} catch (IllegalStateException e) {
					System.out.println("You've already entered that letter.");
				}
			}
			playTurn(chosenLetter);
				
		}
		
		reader.close();

		
	}
	
	/**
	 * method run. tests letter
	 * @param chosenLetter given to test
	 */
	private static void playTurn(CharSequence chosenLetter) {
		//check if word contains the letter
		if(word.contains(chosenLetter)) {
			System.out.println("you guessed right!");
			//loop through word
			for(int i=0; i<word.length(); i++) {
				//test if that character in string equals letter
				if(word.charAt(i) == chosenLetter.charAt(0)) {
					//reconstruct string to replace the hidden character - with letter
					wordProgress = wordProgress.substring(0,i) + chosenLetter + wordProgress.substring(i+1);
				}
			}
			
			//print progress
			printWordProgress();

		} else {
			System.out.println("No letters found in word. Try again!");
		}
		

	}

	/**
	 * checks if letter is a letter and if it has already been guessed
	 * @param chosenLetter to check
	 */
	private static void checkUserInput(String chosenLetter) {
		if(!(Character.isLetter(chosenLetter.charAt(0)))) {
			throw new IllegalArgumentException();
		}
		
		if(wordProgress.contains(chosenLetter)) {
			throw new IllegalStateException();
		}
	}

	/*
	 * method to check word to see if no more dashes exist and word is completely guessed
	 */
	private static boolean wordComplete() {
		if(!wordProgress.contains("-")) {
			System.out.print("Congrats, you've guessed the word!");
			return true;
		}
		return false;
	}
	
	/**
	 * helper method to pring word progress
	 */
	public static void printWordProgress() {

        System.out.println(wordProgress);

	}

	/**
	 * helper method to generate word
	 * @return word
	 */
	public static  String generateWord() {
		System.out.println("Guess the word:");
		//textFile array that will store each word from file
		ArrayList<String> textFile = new ArrayList<String>();
		
		//instantiate bufferedreader to get lines of words from text file
		BufferedReader in = null;
		String randomWord = "";
		
		try {
			in = new BufferedReader(new FileReader("words_alpha.txt"));
			
			String line;
			
			//add each line from text file to array created earlier
			while((line = in.readLine()) != null) {
				textFile.add(in.readLine());
			}
		
			//instantiate random number
			Random randNumGenerator = new Random();
		    int randNum = randNumGenerator.nextInt(textFile.size());
		    
		    //use random number to get random word from word array list
		    randomWord = textFile.get(randNum);
		    int stringSize = randomWord.length();
		    
		    //create the "hidden" word, based on how long word it
		    System.out.println(randomWord);
		    for(int i = 0; i < stringSize; i++) {
		    	wordProgress += "-";
		    }
		   
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
	            try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
		}
	    return randomWord;	}
}
