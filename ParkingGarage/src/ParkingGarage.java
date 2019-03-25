/*
 * Your implementation of the ParkingGarage class should have a car array(Car[]) to represent the parking spots. The "spot number" of each parking spot is its array index (starting with spot 0).

Your ParkingGarage constructor should take in capacity as input. This will represent the capacity of the parking garage instance.

Your ParkingGarage class should implement:

park(Car car, int spot) method, that will add the car to a parking spot.
If the user attempts to add the car to a spot that doesn't exist (outside the array), catch the exception and notify the user.
If there's already a car parked in the spot, notify the user that the car cannot be parked in that spot.
vacate(int spot) method, that will remove the car from the specified spot.
If the user attempts to remove a car from an empty spot, notify the user that no car is present in that spot.
printInventory() method, that prints out to the console the the listing of all the cars with a brief description. For each car, please include:
The spot number (array index) of the car in the parking garage
The car's color, license #, make, and model
 */
public class ParkingGarage {
	//initiating variables that serve as attributes for the parking garage
	private Car[] parkingSpots;
	private int capacity;
	
	/*
	 * constructor that takes in capacity parameter, assigns to capacity attribute and initializes car array that adds spots to "Garage"
	 */
	protected ParkingGarage() {
		
	}
	
	protected ParkingGarage(int capacity) {
		this.capacity = capacity;
		parkingSpots = new Car[capacity];
	}
	
	/*
	 * park method that will adds car object to the car array.
	 */
	protected void park(Car parkingCar, int spot) {
		try {
			
			if(parkingSpots[spot] == null) {
				parkingSpots[spot] = parkingCar;
				System.out.println(parkingCar.getMake() + " " + parkingCar.getModel() + " parked in spot "+ (spot+1));
			} else {
				System.out.println("Can't park " + parkingCar.getMake() + " " + parkingCar.getModel() + ". " +"Spot " + (spot+1) + " already has a car in it.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured. That spot doesn't exist in this parking garage.");
		} finally {
			System.out.println("--------------------------------");
		}
		
	}
	
	//Getters and setters
	public Car[] getParkingSpots() {
		return parkingSpots;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
		parkingSpots = new Car[capacity];
	}

	/**
	 * method to vacate car from parking spot
	 * @param spot that you want to remove car from
	 */
	protected void vacate(int spot) {
		
		try {
			String carInSpot = parkingSpots[spot].getMake() + " " + parkingSpots[spot].getModel();
			if(parkingSpots[spot] != null) {
				parkingSpots[spot] = null;
				System.out.println(carInSpot + " has been towed.");
			} else {
				System.out.println("This spot is already vacated.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured. That spot doesn't exist in this parking garage.");
		} catch (NullPointerException e) {
			System.out.println("There is no car to tow from this spot.");
		} finally {
			System.out.println("--------------------------------");
		}
		
		
	}
	
	protected void printInventory() {
		for(int i=0; i<parkingSpots.length; i++) {
			try {
				System.out.println("Spot #"+(i+1)+":");
				System.out.println("    Color: " + parkingSpots[i].getColor());
				System.out.println("    License Plate #: "+ parkingSpots[i].getLicenseNum());
				System.out.println("    Make: " + parkingSpots[i].getMake());
				System.out.println("    Model: " + parkingSpots[i].getModel());
			}
			catch (NullPointerException e) {
				System.out.println("No car in this spot.");
			}
			finally {
				System.out.println("----------------");
			}
			
		}
	}
}
