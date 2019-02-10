/*
 * type (coupe, hatchback, or sedan)
number of doors
 */
public class Car extends Vehicle {
	
	private CarType type;
	private int numDoors;
	
	/*
	 * car constructor that gets 4 attributes from parent super class and has to assign two attributes of its own
	 */
	public Car(String licenseNum, String make, String model, double price, CarType type, int numDoors) {
		super(licenseNum, make, model, price);
		this.type = type;
		this.numDoors = numDoors;
	}

	@Override
	public String basicDetails() {
		return "Car is a " + getType() + " and has " + getNumDoors() + " doors.";
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	
	
}
