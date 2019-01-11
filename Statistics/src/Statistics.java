import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		System.out.println("Please enter a list of numbers delimmited by comma.");
		
		Scanner reader = new Scanner(System.in);
		String numberList = reader.nextLine();
		reader.close();
		
		String[] numbString = numberList.split(",");
		int[] numbs = new int[numbString.length];
		
		for (int i = 0; i < numbs.length; i++) {
			numbs[i] = Integer.parseInt(numbString[i]);
		}
		
		int minNumb = calcMin(numbs);
		int maxNumb = calcMax(numbs);
		int sumNumb = calcSum(numbs);
		int lengthNumb = numbs.length;
		double avgNumb = (double)sumNumb / lengthNumb;
		
		System.out.println(minNumb);
		System.out.println(maxNumb);
		System.out.println(lengthNumb);
		System.out.println(sumNumb);
		System.out.println(avgNumb);

		
	}

	public static int calcMin(int[] numbArray) {
		int currentMin = numbArray[0];
		for (int i = 1; i < numbArray.length; i++) {
			if (numbArray[i] <= currentMin) {
				currentMin = numbArray[i];
			} 
			
		}
		return currentMin;
	}
	
	public static int calcMax(int[] numbArray) {
		int currentMax = numbArray[0];
		for (int i = 1; i < numbArray.length; i++) {
			if (numbArray[i] >= currentMax) {
				currentMax = numbArray[i];
			} 
			
		}
		return currentMax;
	}
	
	public static int calcSum(int[] numbArray) {
		int sum = 0;
		for(int i = 0; i < numbArray.length; i++) {
			sum += numbArray[i];
		}
		return sum;
	}
	
}
