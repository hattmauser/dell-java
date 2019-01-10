package Calc;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Please enter first number.");
		
		Scanner reader = new Scanner(System.in);
		int firstNum = Integer.parseInt(reader.nextLine());
		
		System.out.println("Please enter second number.");
		
		int secondNum = Integer.parseInt(reader.nextLine());
		reader.close();
		
		int add = addition(firstNum, secondNum);
		int sub = subtract(firstNum, secondNum);
		int mult = multiply(firstNum, secondNum);
		int quotient = quotient(firstNum, secondNum);
		
		System.out.println("Add: " + add);
		System.out.println("Subtract: " + sub);
		System.out.println("Multiply: " + mult);
		System.out.println("Divide: " + quotient);
		
	}
	
	public static int addition(int firstNum, int secondNum) {
		int result = firstNum + secondNum;
		return result;
	}
	
	public static int subtract(int firstNum, int secondNum) {
		int result = firstNum - secondNum;
		return result;
	}
	
	public static int multiply(int firstNum, int secondNum) {
		int result = firstNum * secondNum;
		return result;
	}
	
	public static int quotient(int firstNum, int secondNum) {
		int result = firstNum / secondNum;
		return result;
	}
	
}
