
public class Car extends Vehicle{
	
	public int numberOfDoors;

	public Car(int numWheels, int capacity, int numberOfDoors) {
		super(numWheels, capacity);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Car [numberOfDoors=" + numberOfDoors + ", getNumWheels()=" + getNumWheels() + ", getCapacity()="
				+ getCapacity() + "]";
	}

	@Override
	public String honk() {
		// TODO Auto-generated method stub
		return "ERRRR ERRRRR";
	}
	
	
	
}
