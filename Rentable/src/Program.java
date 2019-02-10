import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * instantiating rentable objects
		 */
		Rentable hotelRoom = new Room("Hilton", 125.87);
		Rentable vacationCondo = new Condo("Paradise Resorts", 2380.98);
		Rentable visegripTool = new Tool("Park Tools", 7.87);
		Rentable hammerTool = new Tool("Hefty", 5.66);
		Rentable hostelRoom = new Room("Hip Hostel", 45.43);
		Rentable timeshareCondo = new Condo("Mountain Bliss", 2083.88);
		
		Rentable[] objectsForRent = new Rentable[8];
		
		objectsForRent[0] = hotelRoom;
		objectsForRent[1] = vacationCondo;
		objectsForRent[2] = visegripTool;
		objectsForRent[3] = hammerTool;
		objectsForRent[4] = hostelRoom;
		objectsForRent[5] = timeshareCondo;
		
		//I can also assign array value directly to object
		objectsForRent[6] = new Room("Marriot", 104.56);
		objectsForRent[7] = new Tool("Crank Brothers", 10.32);
		
		//I can also initialize array and assign objects all in one line
		Rentable[] objectsForRentElsewhere = {new Condo("Cabin in the Woods", 790.43), new Room("Luxury Downtown Airbnb in Ausitn", 230.44)};
		
		System.out.println("Available to rent!");
		System.out.println("-------------------------------------------------"+"\n");
		
		Scanner reader = new Scanner(System.in);
		String rentAnswer = "No";
		int daysOfStay = 0;

		do {
			/**
			 * looping through each rentable object to display details, prompt user for price
			 */
			for(Rentable r: objectsForRent) {
				
				if(rentAnswer.toLowerCase().equals("no")) {
					System.out.println((r.getClass().toString()).substring(6) + ": " + r.getDescription() + ", daily rate of $" + r.getDailyRate());
				}
				
				if(rentAnswer.toLowerCase().equals("yes")) {
					if(r instanceof Room) {
						System.out.println("Room: " + r.getDescription() + ", total rent cost $" + r.getPrice(daysOfStay));
					}
					
					if(r instanceof Condo) {
						System.out.println("Condo: " + r.getDescription() + ", total rent cost $" + r.getPrice(daysOfStay));
					}
					
					if(r instanceof Tool) {
						System.out.println("Tool: " + r.getDescription() + ", total rent cost $" + r.getPrice(daysOfStay));
					}
					
				}
					
			}
			

			System.out.println("\n" + "Would you like to get price estimate for your stay?");
			boolean validPick = false;
			while(!validPick) {
				try {
					rentAnswer = reader.next();
					checkUserInput(rentAnswer);
					validPick = true;
					
				} catch (Exception e) {
					System.out.println("Please enter a yes or no.");
				} 
			}
			
			if(rentAnswer.equalsIgnoreCase("yes")) {
				System.out.println("How many days?");
				daysOfStay = reader.nextInt();
			} else break;

		}
		while(rentAnswer.equalsIgnoreCase("Yes"));
		
		reader.close();
		
	}
	public static void checkUserInput(String s) {
		if(!(s.toLowerCase().equals("yes") || s.toLowerCase().equals("no"))) {
			throw new IllegalArgumentException();
		}
	}

}
