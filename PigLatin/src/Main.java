import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("This is a pig latin translator. Please enter in a word and I will return the translation.");
		
		Scanner reader = new Scanner(System.in);
		String userInput = reader.nextLine();
		reader.close();
		
		String result = "";
		if(userInput.contains(" ")) {
			String[] parts = userInput.split(" ");
			for (int i = 0; i < parts.length; i++) {
				result += convertPigLatin(parts[i]) + " ";
			}
		} else {
			result = convertPigLatin(userInput);
		}
		
		
		System.out.println("Translation is " + result);
	}
	
	public static String convertPigLatin(String input) {
		if(input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o' || input.charAt(0) == 'u') {
			return startsWithVowel(input);
		} else if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
			return startsWithConsonant(input);
		} else {
			return noVowels(input);
		}
	}
	
	public static String startsWithVowel(String input) {
		Random randNumGen = new Random();
		int compNum = randNumGen.nextInt(3);
		String ranWord;
		
		if (compNum == 0) {
			ranWord = "way";
		} else if (compNum == 1) {
			ranWord = "yay";
		} else {
			ranWord = "ay";
		}
		
		String result = input + ranWord;
		return result;
	}
	
	public static String startsWithConsonant(String input) {
		int positionOfVowel = 0;
		for (int i = 0; i < input.length(); i++) {
			char firstChar = input.charAt(i);
			if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
				positionOfVowel = i;
				break;
			}
		}
		
		String lettersBeforeVowel = input.substring(0, positionOfVowel);
		String lettersAfterVowel = input.substring(positionOfVowel);
		
		String result = lettersAfterVowel + lettersBeforeVowel + "ay";
		
		return result;
	}
	
	public static String noVowels(String input) {
		String result = input + "ay";
		return result;
	}
	
}
